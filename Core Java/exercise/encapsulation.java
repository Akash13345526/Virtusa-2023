package exercise;

class Account{
	
	private String name;
	private long acc_no;
	private String bankname;
	private long phoneNo;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
	      this. name=name;
	}
	public long getacc_no() {
		return acc_no;
		
	}
	public void setacc_no(long acc_no) {
		this.acc_no=acc_no;
		
	}
	public String getbankname() {
		return bankname;
	}
	public void setbankname(String bankname) {
		this.bankname=bankname;
	}
	public long getphoneNo() {
		return phoneNo;
	}
	public void setphoneNo(long phoneNo) {
		this.phoneNo=phoneNo;
		
	}
	
	
}

public class encapsulation {
	
	public static void main(String[] args) {
		Account acc=new Account();
		acc.setName("bhuvan");
		acc.setacc_no(12234567811111L);
		acc.setbankname("state name");
		acc.setphoneNo(9344667107l);
		System.out.println("********bank details********");
		//System.out.println(acc.getName());
		System.out.println("     Acc_no    "+acc.getacc_no());
		System.out.println(acc.getbankname()+"  "+acc.getphoneNo()+"  "+acc.getName());
		
		
			
	
	
	}

}
