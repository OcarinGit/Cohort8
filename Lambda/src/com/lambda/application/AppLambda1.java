package com.lambda.application;

import com.lambda.misclases.*;

public class AppLambda1  {

	public static void main(String[] args) {
		
		//Código sin expresion lambda
		/*Drawable d = new Drawable() {
			public void draw()
			{
				System.out.println("Hola Munditu");
			}
		};
		d.draw();*/
		
		//Código con expresión lambda
		Drawable d2=()->
		{
			System.out.println("Hola Munditu!!");
		};
		d2.draw();

	}

}



