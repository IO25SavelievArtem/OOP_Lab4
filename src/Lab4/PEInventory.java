/*
 * @(#) PEInventory.java
 *
 * Copyright (c) 2023 Artem Saveliev. All Rights Reserved.
 */
package Lab4;

/*
 * Is used to describe object Physical Education Inventory
 *
 * @version		1.0 16 Mar 2023
 * @author  	Artem Saveliev
 */
public class PEInventory {
	String objectType;	//тип предмета: м'яч, штанга, і т.д.
	String sportName;	//спорт, у якому предмет вікористовується
	boolean canBeUsedIndoors;	//чи використовується предмет у залі
	int number;	//кількість таких предметів
	double price;	//ціна об'єкта

	public PEInventory(String objectType, String sportName, boolean canBeUsedIndoors, int number, double price){
		this.objectType = objectType;
		this.sportName = sportName;
		this.canBeUsedIndoors = canBeUsedIndoors;
		this.number = number;
		this.price = price;
	}
	public int getNumber(){return number;}
	public double getPrice(){return price;}
}

