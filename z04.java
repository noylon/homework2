import java.util.Scanner;
public class z04 {
   public static void main(String[] args) {
         
	       Scanner sc = new Scanner(System.in);
	             
		           System.out.println("국어 점수를 입력하세요: ");
			         int kor = sc.nextInt();
				       
				             System.out.println("영어 점수를 입력하세요: ");
					           int eng = sc.nextInt();
						         
							       System.out.println("수학 점수를 입력하세요: ");
							             int math = sc.nextInt();
								           
									         int tot = kor+eng+math;
										       float avg = tot/3;
										             
											           System.out.println("입력하신 점수의 총점은 "+tot+"이고,\n"+String.format("평균은 %.1f 입니다.",avg));
												         
													       if(kor/10 >= 9){
													                System.out.println("국어 점수가 우수합니다.");
															         
																       }
																             else if(eng/10 >= 9){
																	              System.out.println("영어 점수가 우수합니다.");
																		            }
																			          else if(math/10 >= 9 ){
																				           System.out.println("수학 점수가 우수합니다.");
																					         }
																						       else;
																						          }
																							     
																							     }

