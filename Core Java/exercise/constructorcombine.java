package exercise;

public class constructorcombine {
		int iVar = 10;
		static int sVar=20;
		
		constructorcombine(){
			int loVar = 30;
			
//			sVar =20;
			System.out.println("------------- Constructor Start---------------");
			System.out.println("Constructor loVar = "+loVar);
			System.out.println("Constructor InsVar = "+iVar);
			System.out.println("Constructor StVar = "+sVar);
			System.out.println("------------- Constructor End---------------");
      //   	iMet();
     	//	sMet();
		}
		
		void iMet() {
			int loVar = 300;
			
			System.out.println("------------- Instance ---------------");
			constructorcombine cc2 = new constructorcombine();
			
			System.out.println("Ins Meth loVar = "+loVar);
			System.out.println("Ins Meth InsVar = "+cc2.iVar);
			System.out.println("Ins Meth StVar = "+cc2.sVar); 
			
		}
		static void sMet() {
			int loVar = 3000;
			System.out.println("------------- Static ---------------");
			constructorcombine cc3 = new constructorcombine();
			System.out.println("Static Meth loVar = "+loVar);
			System.out.println("Static Meth InsVar = "+cc3.iVar); 
			System.out.println("Static Meth StVar = "+sVar);
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			constructorcombine cc1 = new constructorcombine();
			cc1.iMet();
			sMet();

		}

	}



