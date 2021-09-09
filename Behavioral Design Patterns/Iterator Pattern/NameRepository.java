/**
 * @(#)NameRepository.java
 *
 *
 * @author
 * @version 1.00 2021/7/29
 */


public class NameRepository implements Container {

	public String names[] = {"Robert", "John", "Julie", "Lora"};


	@Override
	public Iterator getIterator(){
		return new NameIterator();
	}

	private class NameIterator implements Iterator{

		int index;

		@Override
		public boolean hasNext(){
			if(index < names.length){
				return true;
			}//end if
			return false;
		}

		@Override
		public Object next(){
			if(this.hasNext()){
				return names[index++];
			}//end if
			return null;
		}//end next method





	}//end inner class NameIterator
}