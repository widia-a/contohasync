package asyncexample.asyncadvance;

public interface AsyncListener {
	
		  
	    // this can be any type of method
	    public void onAsyncParent(int intAsyncParent);
	    public void onAsyncChild(int intAsyncParent,int intAsyncParentLoop);
}