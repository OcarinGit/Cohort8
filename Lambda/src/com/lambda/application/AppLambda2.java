package com.lambda.application;

import com.lambda.misclases.*;

public class AppLambda2 {

	public static void main(String[] args) {
		Sayable objSay = (name)->
		{
			return("Hola "+name);
		};
		System.out.println(objSay.say("El Macho"));

	}

}
