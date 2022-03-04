/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Angel
 */
public class ComparateAsc implements IComparator {

	@Override
	/***
	 * @param _object1
	 * @param _object2
	 */
	public int Compare(Object _object1, Object _object2) {
		// TODO Auto-generated method stub
		
		int numero1= (int)_object1;
		int numero2= (int)_object2;
		
		if(numero1 > numero2 )
		{
			return 1;
		}
		
		else if (numero1 < numero2)
		{
			return -1;
		}
		
		else
		return 0;
	}
}
