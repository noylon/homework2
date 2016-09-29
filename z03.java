import java.util.Scanner;

public class z03 {
    public static void main(String[] args) {
           
	          Scanner sc = new Scanner(System.in);
		         
			        int m_count=0;
				       
				              System.out.println("날수를 입력하세요: ");
					             int days = sc.nextInt();
						            
							           int seconds=days*24*60*60;
								          
									         if(seconds/1000000>=1){
										           m_count=seconds/1000000;
											             System.out.println("날수에 해당되는 기간은 모두 "+seconds+"초 입니다.");
												               System.out.println("100만 초가 모두" +m_count+"번이나 포함됩니다.");
													              }
														             else System.out.println("날수에 해당되는 기간은 모두 "+seconds+"초 입니다.");

															            
																           
																	       }
																	          

																		  }
