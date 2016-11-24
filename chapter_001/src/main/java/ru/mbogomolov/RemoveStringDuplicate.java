package ru.mbogomolov;

import java.util.*;
import java.lang.*;
import java.io.*;


public class RemoveStringDuplicate{
	public String[] array;

public RemoveStringDuplicate(String[] array){
	this.array = array;
}
	
public String[]	removeDuplicate(){
	int nulls = 0;
	for (int index = 0; index < this.array.length-2; index++) {
			for (int element = index+1; element < this.array.length-1; element++){
             if (this.array[index] != null && this.array[element] != null && this.array[index].equals(this.array[element])){
                 this.array[element] = null;
                 nulls++;
             }   
        }
	}
	for (int i = this.array.length - 1; i >= 0; i--) {
		for (int j = 0; j < i; j++) {
			if (this.array[j] == null) {
				this.array[j] = this.array[j + 1];
				this.array[j + 1] = null;
			}
		}
	}
     
    String[] newArray = Arrays.copyOf(this.array, this.array.length - nulls);
	
	return newArray;
}
}