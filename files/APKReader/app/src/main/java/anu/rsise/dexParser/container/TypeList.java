package anu.rsise.dexParser.container;

public class TypeList {

	public static class TypeItem
	{
		public short type_idx;
		public String type_str;
	}
	
	public int size;
	public TypeItem list[];
	
	public TypeList(int size)
	{
		this.size = size;
		list = new TypeItem[size];
		for (int i = 0; i < size; i++) list[i] = new TypeItem();
	}
}
