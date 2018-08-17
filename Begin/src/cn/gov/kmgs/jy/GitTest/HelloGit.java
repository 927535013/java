package cn.gov.kmgs.jy.GitTest;

public class HelloGit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("hello world");
		HelloGit hello = new HelloGit();
		hello.RemoteCommit();
	}
	
	private void RemoteCommit(){
		System.out.print("remote commit test");
	}
	
	private void bugCommit(){
		System.out.print("bug commit");
	}

}
