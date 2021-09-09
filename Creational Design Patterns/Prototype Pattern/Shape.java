


public abstract class Shape implements Cloneable{

	private String id;
	protected String type;

	abstract void draw();

	public String getType(){
		return type;

	}//end getType method


	public String getId(){
		return id;

	}//end getId method


	public void setId(String id){
		this.id = id;
	}//end setType method


    public Object clone(){
    	Object clone = null;

    	try{
    		clone = super.clone();
    	} catch(CloneNotSupportedException e){
    		e.printStackTrace();
    	}
    	return clone;
    }

}