interface Shape {
	
	//Not allowed. Interfaces may only declare methods, not attributes.
	//protected int sides;
	
	int getSides();
	double calcPerimeter();
}