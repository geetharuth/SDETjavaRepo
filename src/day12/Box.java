package day12;

public class Box {
double width, height, depth;
Box()
{
	/*width=0;
	height=0;
	depth=0;
	
	width=height=depth;*/
}
Box(double w,double h,double d)
{
	width=w;
	height=h;
	depth=d;
}
Box(double len)
{
	width=height=depth=len;
}
double volume()
{
	return(width*height*depth);
}
}
