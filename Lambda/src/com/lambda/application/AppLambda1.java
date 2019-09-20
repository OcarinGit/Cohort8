package com.lambda.application;

import com.lambda.misclases.*;

public class AppLambda1  {

	public static void main(String[] args) {
		
		//C�digo sin expresion lambda
		/*Drawable d = new Drawable() {
			public void draw()
			{
				System.out.println("Hola Munditu");
			}
		};
		d.draw();*/
		
		//C�digo con expresi�n lambda
		Drawable d2=()->
		{
			System.out.println("Hola Munditu!!");
		};
		d2.draw();

	}

}



