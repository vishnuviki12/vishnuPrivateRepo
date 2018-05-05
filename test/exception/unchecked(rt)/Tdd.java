System.out.println("Enter the type of Film\n1.COMEDY\n2.ROMANTIC\n3.THRILLER");
        try {
            type = this.s.nextInt();
        }
        catch(Exception e) {
            System.out.println("WARNING !!.. Enter only integer value");
            this.s = new Scanner(System.in);
            type = this.s.nextInt();
        }
