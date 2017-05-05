package edu.ncsu.monopoly;

public class DeterministicDie extends Die {
        //dado tiene un 3 de mas haciendo que este numero sea mas probable que salga CORREGIDO
	int [] diethrows = new int[]{2,3,4,5,6,1};
	int index = 0;
	public int getRoll() {
		if (index < diethrows.length){
			index++;
			return diethrows[index];
		}
		else{
			index = 0;
			return diethrows[index];
		}
	}
}
