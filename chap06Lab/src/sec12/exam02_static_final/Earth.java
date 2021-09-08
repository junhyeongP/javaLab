package sec12.exam02_static_final;

public class Earth {
	//상수는 대문자로
	static final double EARTH_RADIUS=6400;
	static final double EARTH_SURFACE_AREA;
	
	static {
		EARTH_SURFACE_AREA=4*Math.PI*EARTH_RADIUS*EARTH_RADIUS;
	}
	
}
