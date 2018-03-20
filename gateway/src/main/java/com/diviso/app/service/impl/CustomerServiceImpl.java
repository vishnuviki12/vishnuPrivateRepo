package com.diviso.app.service.impl;

import com.diviso.app.service.CustomerService;
import com.diviso.app.domain.Customer;
import com.diviso.app.repository.CustomerRepository;
import com.diviso.app.service.dto.CustomerDTO;
import com.diviso.app.service.mapper.CustomerMapper;
import com.diviso.app.stream.MessageStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.MimeTypeUtils;


/**
 * Service Implementation for managing Customer.
 */
@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

    private final Logger log = LoggerFactory.getLogger(CustomerServiceImpl.class);

    private final CustomerRepository customerRepository;

    private final CustomerMapper customerMapper;
    
    private final MessageStream messageStream;

    public CustomerServiceImpl(CustomerRepository customerRepository, CustomerMapper customerMapper, MessageStream messageStream) {
        this.customerRepository = customerRepository;
        this.customerMapper = customerMapper;
        this.messageStream = messageStream;
    }

    /**
     * Save a customer.
     *
     * @param customerDTO the entity to save
     * @return the persisted entity
     */
    @Override
    public CustomerDTO save(CustomerDTO customerDTO) {
        log.debug("Request to save Customer : {}", customerDTO);
        Customer customer = customerMapper.toEntity(customerDTO);
        customer = customerRepository.save(customer);
        return customerMapper.toDto(customer);
    }

    /**
     * Get all the customers.
     *
     * @param pageable the pagination information
     * @return the list of entities
     */
    @Override
    @Transactional(readOnly = true)
    public Page<CustomerDTO> findAll(Pageable pageable) {
        log.debug("Request to get all Customers");
        return customerRepository.findAll(pageable)
            .map(customerMapper::toDto);
    }

    /**
     * Get one customer by id.
     *
     * @param id the id of the entity
     * @return the entity
     */
    @Override
    @Transactional(readOnly = true)
    public CustomerDTO findOne(Long id) {
        log.debug("Request to get Customer : {}", id);
        Customer customer = customerRepository.findOne(id);
        return customerMapper.toDto(customer);
    }

    /**
     * Delete the customer by id.
     *
     * @param id the id of the entity
     */
    @Override
    public void delete(Long id) {
        log.debug("Request to delete Customer : {}", id);
        customerRepository.delete(id);
    }

	@Override
	public boolean publish(CustomerDTO customerDTO) {
		
		MessageChannel messageChannel = this.messageStream.write();
		
		boolean result = messageChannel.send(
				MessageBuilder.withPayload(customerMapper.toEntity(customerDTO))
				.setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON).build()
				) ;
		
		return result;
	}
    
    
}
