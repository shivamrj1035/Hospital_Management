import java.util.*;
//import java.io.*;


public class Hospital_Management {
    public static void main(String[] args) {
        AppointmentBooking ap=new AppointmentBooking();
        Scanner sc=new Scanner(System.in);
        //ap.dataAdd();
		System.out.println("================================*=*=*=*=*=*=============================================");
        System.out.printf("%25s%5s\n","","We always ready to care about you...!");
        System.out.println("================================*=*=*=*=*=*=============================================");
        start();
    }
	static void start()
	{
		
		AppointmentBooking ap=new AppointmentBooking();
		ap.dataAdd();
		Scanner sc=new Scanner(System.in);
		int flag=0;
        while(flag==0){
            //new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();

            
            System.out.println("\n1) Doctor \t2) Patient \t3) Admin \4) Exit");
            String choice_1=sc.nextLine();
            switch(choice_1){
                case "1":   ap.doctor();
                flag=1;
                break;
                case "2":   ap.patient();
                flag=1;
                break;
                case "3":   ap.admin();
                flag=1;
                break;
                case "4":   System.out.println("Thanks for Visiting");
                flag=1;
                break;
                default: System.out.print("Enter valid Input: ");
                            choice_1=sc.nextLine();
                            flag=0;
                            break;
            }
        }

	}
}
class AppointmentBooking extends Hospital_Management{
	
    ArrayList<String> doctorName =new ArrayList<String>();
    ArrayList<String> doctorQualification =new ArrayList<String>();
    ArrayList<String> doctorGender =new ArrayList<String>();
    ArrayList<String> doctorPassword =new ArrayList<String>();
    ArrayList<Integer> doctorAge =new ArrayList<Integer>();
    ArrayList<String> doctorMobileNo =new ArrayList<String>();
    
    ArrayList<String> patientName =new ArrayList<String>();
    ArrayList<String> patientcnfrmPswd =new ArrayList<String>();
    ArrayList<String> patientGender =new ArrayList<String>();
    ArrayList<String> patientPassword =new ArrayList<String>();
    ArrayList<Integer> patientAge =new ArrayList<Integer>();
    ArrayList<String> patientMobileNo =new ArrayList<String>();

    ArrayList<String> patientNameBooking =new ArrayList<String>();
    ArrayList<Integer> patientAgeBooking =new ArrayList<Integer>();
    ArrayList<String> patientGenderBooking =new ArrayList<String>();

    ArrayList<Integer> doctorID=new ArrayList<Integer>();

    void dataAdd() //Method for set default Data of Doctors
    {
        doctorName.add("1) Dr.Shivam Jayswal");
        doctorName.add("2) Dr.Samay Bhavsar");
        doctorName.add("3) Dr.Tithi Prajapati");
        doctorName.add("4) Dr.Hiral Parekh");
        doctorName.add("5) Dr.Monishca Cross");

        doctorQualification.add("MBBS");
        doctorQualification.add("MBBS, MD");
        doctorQualification.add("MBBS, MD");
        doctorQualification.add("MBBS, Surgeon");
        doctorQualification.add("BAMS");

        doctorGender.add("M");
        doctorGender.add("M");
        doctorGender.add("F");
        doctorGender.add("F");
        doctorGender.add("F");

        doctorPassword.add("Shivam123");
        doctorPassword.add("Samay123");
        doctorPassword.add("Tithi123");
        doctorPassword.add("Hiral123");
        doctorPassword.add("Monishca123");

        doctorAge.add(25);
        doctorAge.add(26);
        doctorAge.add(27);
        doctorAge.add(28);
        doctorAge.add(29);

        doctorMobileNo.add("1234567890");
        doctorMobileNo.add("1234567890");
        doctorMobileNo.add("1234567890");
        doctorMobileNo.add("1234567890");
        doctorMobileNo.add("1234567890");

    }

    void admin() 
    {
        Scanner sc=new Scanner(System.in);
        int flag=0;
        while(flag==0){
            //new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
            System.out.println("================================*=*=*=*=*=*=============================================");
            System.out.printf("%25s%5s\n","","Welcome Admin");
            System.out.println("================================*=*=*=*=*=*=============================================");
            System.out.println("\n\n1.Doctor List \t2.Registered Patients \3.Patients with Appointment \t4.Main menu \5.Exit");
            String choice_2=sc.nextLine();
            switch(choice_2)
            {
                case "1": for(int i=0;i<=doctorName.size()-1;i++)
                            {
                                System.out.println("Name: "+doctorName.get(i));
                            }
                            System.out.println("\n\n1.Main Menu \t2.Previous Menu");
                            String menuChoice=sc.nextLine();
                            if(menuChoice=="1") 
                            {
                                flag=1;
                            }
                            else break;
                            break;
                case "2": if(patientName.isEmpty())
                            {
                                System.out.println("No Registered Patient Found");
                                break;
                            }
                            else 
                            {
                                for(int i=0; i<patientName.size();i++)
                                {
                                    System.out.println((i+1)+"==> "+patientName.get(i));
                                }
                                System.out.println("\n\n1.Main Menu \t2.Previous Menu");
                                String menuChoice_2=sc.nextLine();
                                 if(menuChoice_2=="1") 
                                {
                                    flag=1;
                                }
                                else break;
                            }
                            break;
                case "3": if(patientNameBooking.isEmpty())
                            {
                                System.out.println("No Appointments yet..!");
                                break;
                            }
                            else 
                            {
                                System.out.println("\t\tAppointments: \n");
                                for(int i=0;i<patientNameBooking.size();i++)
                                {
                                   System.out.println((i+1)+". => "+patientNameBooking.get(i));
                                }
                                System.out.println("\n\n1.Main Menu \t2.Previous Menu");
                                String menuChoice_2=sc.nextLine();
                                if(menuChoice_2=="1") 
                                {
                                    flag=1;
                                }
                                else break;
                            }
                            break;
                case "4": flag=1;
							start();
                            break;

                default : System.out.println("Wrong input\nPlease select Correct Option:");
                            flag=0;
            }
        }
    }
    void patient()
    {
        Scanner sc=new Scanner(System.in);
        int flag=0;
        while(flag==0)
        {
            System.out.println("================================*=*=*=*=*=*=============================================");
            System.out.printf("%25s%5s\n","","Welcome to Patient Page...!");
            System.out.println("================================*=*=*=*=*=*=============================================");
            System.out.println("\n1.Login \t2.Registration \t3. Exit");
            String choice_3=sc.nextLine();
            switch(choice_3)
            {
                case "1": if(patientMobileNo.isEmpty())
                {
                    System.out.println("First Register Your self then Login again....");
                    break;
                }
                else
                {
                    patientLogin();
                    flag=1;
                }
                break;
                case "2": patientRegistration();
                            flag=1;
                            break;
				case "3": start();
                default : System.out.println("Wrong Input\nPlease chosse correct Option: ");
                            flag=0;
                            break;
            }
        }
    }

    void doctor()
    {
        Scanner sc=new Scanner(System.in);
        
        int flag=0;
        while(flag==0)
        {
            System.out.println("================================*=*=*=*=*=*=============================================");
            System.out.printf("%25s%5s\n","","Welcome to the Doctor's Page...!");
            System.out.println("================================*=*=*=*=*=*=============================================");
            System.out.println("\n1.Login \t2.Registration");
            String choice_4=sc.nextLine();
            switch(choice_4)
            {
                case "1": if(doctorMobileNo.isEmpty())
                {
                    System.out.println("First Register Your self then Login again....");
					flag=1;
                    break;
                }
                else
                {
                    doctorLogin();
                    flag=1;
                }
                break;
                case "2": doctorRegistration();
                            flag=1;
                            break;
                default : System.out.println("Wrong Input\nPlease chosse correct Option: ");
                            flag=0;
                            break;
            }
        }
    }

    void patientLogin()
    {
        Scanner sc=new Scanner(System.in);
        int flag=0;
        String mobileNo;
        System.out.println("\t\t#______________________#");
        System.out.println("\t\t |                     |");
        System.out.println("\t\t |      =>Login<=      |");
        System.out.println("\t\t |_____________________|");
        System.out.println("Enter Your Username(Mobile Number):");
        mobileNo=sc.nextLine();
        System.out.println("Enter Your Password:");
        String password=sc.next();
        int temp=0;
       
		if(temp==0)
            {
                System.out.println("\t\t#______________________#");
                System.out.println("\t\t |                     |");
                System.out.println("\t\t |   Book Appointment  |");
                System.out.println("\t\t |_____________________|");   

                 for(int i=0;i<patientMobileNo.size();i++)
				{
					if((patientMobileNo.get(i)).equals(mobileNo) && (patientPassword.get(i)).equals(password))
					{
						temp=1;
						
						System.out.println("\n\n* Welcome "+patientName.get(i)+", to book appointment Plase choose Your Doctor:: ");
						break;
					}

				}

                for(int j=0;j<doctorName.size();j++)
                {
                    System.out.println(doctorName.get(j));
                }
                int drChoice=sc.nextInt();
                doctorID.add(drChoice);

                while(flag==0)
                {
                    if(drChoice<=doctorName.size() && drChoice > 0 )
                    {
                        System.out.println("\n\nName: "+doctorName.get(drChoice-1)+"\nAge: "+doctorAge.get(drChoice-1)+"\nGender: "+doctorGender.get(drChoice-1)+"\nQualification: "+doctorQualification.get(drChoice-1)+"\nMobile No.: "+doctorMobileNo.get(drChoice-1));
                        System.out.print("\nEnter Your Name: ");
						sc.nextLine();
                        patientNameBooking.add(sc.nextLine());
                        System.out.print("Enter Your Gender(M/F): ");
                        patientGenderBooking.add(sc.next());
                        System.out.println("Booking Successfully Done...");
                        flag=1;
						start();
                        break;
                    }   
                    else 
                    {
                        System.out.println("Enter Correct Input: ");
                        flag=0;
                    }

                }
                
            }
           
            
            else
            {
                System.out.println("Login unsuccessfull");
				patient();
                flag=1;
            }
        

    }

    void patientRegistration()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================*=*=*=*=*=*=============================================");
        System.out.printf("%25s%5s\n","","Welcome to the Patient Registration Page...!");
        System.out.println("================================*=*=*=*=*=*=============================================");
        System.out.println("\n\nPlease Enter Your Name: ");
        patientName.add(sc.nextLine());
        System.out.println("Please Enter Your Age: ");
        patientAge.add(sc.nextInt());
        sc.nextLine();
        System.out.println("Please Enter Your Mobile Number: ");
        String mno1=sc.nextLine();
        String mno2;
        int flag=0,temp=0;
        if(patientMobileNo.isEmpty())
        {
            patientMobileNo.add(mno1);
            System.out.println("Enter Password");
            patientPassword.add(sc.next());
            System.out.println("Registration Successfull..!!");
            temp=1;
			patient();
        }
        else{
            for(int i=0;i<patientMobileNo.size();i++)
            {
                mno2=patientMobileNo.get(i);
                if(mno2==mno1)
                {
                    temp=1;
                    break;
                }

            }
            if(temp==0)
            {
                patientMobileNo.add(mno1);
                // System.out.println("Enter Your Age: ");
                // patientrAge.add(sc.nextInt());
                // sc.nextLine();
                System.out.println("Enter Password: ");
                patientPassword.add(sc.nextLine());
                System.out.println("Registration Successfull..!!");
                System.out.println("\t\tDetails: ");
                System.out.println("Name: "+patientName+"Mobile No: "+patientMobileNo);

            }
            else
            {
                System.out.println("same Mobile number Found!");
                // int index=patientName.size()-1;
                // patientName.remove(index);
                //removing this invalid Registration
            }
        }


    }

    void doctorRegistration()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================*=*=*=*=*=*=============================================");
        System.out.printf("%25s%5s\n","","Welcome to the Doctor Registration Page...!");
        System.out.println("================================*=*=*=*=*=*=============================================");
        System.out.println("\n\nPlease Enter Your Name: ");
        doctorName.add(sc.nextLine());
        System.out.println("Please Enter Your Mobile Number: ");
        String mno1=sc.nextLine();
        String mno2;
        int flag=0,temp=0;
        if(doctorMobileNo.isEmpty())
        {
            doctorMobileNo.add(mno1);
            System.out.println("Enter Password");
            doctorPassword.add(sc.next());
            System.out.println("Registration Successfull..!!");
            temp=1;
        }
        else{
            for(int i=0;i<doctorMobileNo.size();i++)
            {
                mno2=doctorMobileNo.get(i);
                if(mno2==mno1)
                {
                    temp=1;
                    break;
                }

            }
            if(temp==0)
            {
                doctorMobileNo.add(mno1);
                System.out.println("Enter Your Age: ");
                doctorAge.add(sc.nextInt());
                sc.nextLine();
                System.out.println("Enter Password: ");
                doctorPassword.add(sc.nextLine());
                System.out.println("Registration Successfull..!!");
                System.out.println("\t\tDetails: ");
                System.out.println("Name: "+doctorName+"Mobile No: "+doctorMobileNo);

            }
            else
            {
                System.out.println("same Mobile number Found!");
                int index=doctorName.size()-1;
                doctorName.remove(index);
                //removing this invalid Registration
            }
        }


    }

    void doctorLogin()
    {
        Scanner sc=new Scanner(System.in);
        int flag=0;
        String mobileNo;
        System.out.println("\t\t#______________________#");
        System.out.println("\t\t |                     |");
        System.out.println("\t\t |   =>DoctorLogin<=   |");
        System.out.println("\t\t |_____________________|");
        System.out.println("Enter Your Username(Mobile Number):");
        mobileNo=sc.nextLine();
        System.out.println("Enter Your Password:");
        String password=sc.nextLine();
        int temp=0;
        for(int i=0;i<doctorMobileNo.size();i++)
        {
            if((doctorMobileNo.get(i)).equals(mobileNo) && (doctorPassword.get(i)).equals(password))
            {
                flag=1;
                
				if(flag==1)
				{
                while(temp==0)
                 {
                    System.out.println("\t\t*Welcome "+doctorName.get(i)+"*");
                    System.out.println("\t1.) Appointments \t2.) Logout");
                    String choice_5=sc.next();
                    int j=0;
                    switch(choice_5)
                    {
                        case "1": if(doctorID.isEmpty()!=true)
                                    {
                                        while(j<=doctorID.size()-1)
                                        {
                                            if( (i+1) ==doctorID.get(j))
                                            {
                                                System.out.println("Patient Name: "+patientNameBooking.get(j));
                                                j++;
                                            }
                                        }
                                    }
                                    else 
                                    {
                                        System.out.println("No Appointments..!!");
                                        temp=1;
                                        break;
                                    }
						case "2": start(); break;
						default : temp=0; break;
                    }
                 }
				}
				break;
            
            }
			else start();
        }

    }
}
