This is a simple code in which we take the emloyee details as input and if he want we can dispay and also raise the salary of an employee.
At first we will give the option to choose his chioce,in which it contain 
											  Enter 1 to create data
											  Enter 2 to dispaly data
											  Enter 3 to raise salary
											  Enter 4 to exit
for this we use the below code

              System.out.println("Enter 1 to create data");
              System.out.println("Enter 2 to dispaly data");
              System.out.println("Enter 3 to raise salary");
              System.out.println("Enter 4 to exit");
              choice=s.nextInt();
 when the user choose his choice acoording to that we will call the methods,for this we user swicth()
                    
                    switch(choice)
                    {
                      case 1:e1.read();
                        b=true;
                        break;
                      case 2:if(b) 
                          e1.dis();
                        else
                          System.out.println("no records");
                        break;
                      case 3:if(b)
                          e1.raise();
                        else
                          System.out.println("no records");
                        break;

                    }
                  }while(choice<4);
There are options like
                       1.CREATE DATA
                       2.DISPLAY DATA
                       3.RAISE SALARY
                       4.EXIT
1.CREATE
      If user want to create the data he can choose option 1.in which it will ask to enter NAME,SALARY,AGE,DESIGNATION.
      for this we have a method read(),in which it will collect the data from the user.
       
       void read()
          {
            System.out.println("Enter name:");
            name=s.next();
            System.out.println("Enter age:");
            age=s.nextInt();
            System.out.println("Enter desig:");
            desig=s.next();
            System.out.println("Enter sal:");
            sal=s.nextInt();

          }
         
2.DISPLAY DATA  
             if the user want to see the details,he can choose this option,but it will show the data only if user had already entered the data or else it will ask to enter the data. 
             for this we have a method disp(),by this we will dispay the details of the user.
             
                     void dis()
          {
            System.out.println("NAME:"+name);
            System.out.println("Sal:"+sal);	
            System.out.println("Designation:"+desig);
            System.out.println("Age:"+age);
          }
3.RAISE SALARY
                if user want to raise the salary of an employee the he can choose this option  and it will raise the salary by 1000rs,but salary only if user had already entered the data or else it will ask to enter the data. 
                for this we have raise() method,by this we will raise the salary of an employee.
                
                        void raise()
          {
            sal+=1000;
          }
		
