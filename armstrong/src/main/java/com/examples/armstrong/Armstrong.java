package com.examples.armstrong;

public class Armstrong 
{ 
    private int numberOfDigits(int number) {
    	int size=0;
    	while(number!=0) {
    		 size+=1;
    		 number/=10;
    	}
    	return size;
    }
	public boolean isArmstrong(int armNumber)throws NumberFormatException {
    	
    	if (armNumber == 0) { //Considering 0 as one digit, 0 is 0 only
			return true;
		}
    	else if(armNumber < 0) {
    		armNumber = Math.abs(armNumber);
    	}
    	int power = numberOfDigits(armNumber);
    	int armNum = 0;
    	int finalCount = 0;
    	int number = armNumber;
    	while(number > 0) {
    		int count = 10;
    		armNum = number%count;
			finalCount += Math.pow(armNum,power);
			number = number/count;
    	}
    	if(finalCount == armNumber) {
			return true;
		}
		else {
			return false;
		}
    }
}
