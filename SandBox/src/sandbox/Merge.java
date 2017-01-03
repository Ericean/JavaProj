/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sandbox;

import sun.applet.Main;

/**
 *
 * @author Ze
 */
public class Merge {
    int MAX=1000;
    private int[] aux=new int[1000];;//auxiliary array
    public void merge(int a[], int lo, int mid, int hi)
{
	
	int i=lo,j=mid+1;//sublist pointers
	//copy a to aux
	int k;
	for(k=lo;k<=hi;k++)
	{
	  aux[k]=a[k];
	}
	for(k=lo;k<=hi;k++)
	{	//endcases
		if(i>mid) 	  a[k]=aux[j++];
		else if(j>hi) a[k]=aux[i++];
		//main rountine
		else if(aux[i]>aux[j]) a[k]=aux[j++];
		else a[k]=aux[i++];
	}
	
             
}
    public static void main(String[] args) {
       int a[]={4,5,6,3,9,27,21,5,6,7};
       Merge m=new Merge();
       m.merge(a,0,4,9);
	int  k;
	for(k=0;k<10;k++)
		          System.out.println(a[k]);
	
    }
}
