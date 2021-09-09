/**
 * @(#)ProxyImage.java
 *
 *
 * @author
 * @version 1.00 2021/7/22
 */


public class ProxyImage implements Image{

	private RealImage realImage;
	private String fileName;

    public ProxyImage(String fileName) {
    	this.fileName = fileName;
    }

    @Override
    public void display(){
    	if(realImage == null){
    		realImage = new RealImage(fileName);
    	}//end if
    	realImage.display();
    }


}