import java.util.Scanner;

public class z05 {
   public static void main(String[] args) {
         
	       Scanner sc = new Scanner(System.in);
	             
		           String kind = "";
			         
				       System.out.println("태어난 년도를 입력하세요 : ");
				             int bith_year = sc.nextInt();
					           
						         int age = bith_year - 2012 + 1;
							       
							             if(age<7) kind = "유아";
								           else if(age>=7 && age<13) kind="어린이";
									         else if(age>=13 && age<20) kind="청소년";
										       else if(age>=20 && age<30) kind="청년";
										             else if(age>=30 && age<60) kind="중년";
											           else if(age>=60) kind="노년";
												         else;
													       
													             System.out.println(kind+"입니다.");
														           
															         
																    }
																          
																	  }
