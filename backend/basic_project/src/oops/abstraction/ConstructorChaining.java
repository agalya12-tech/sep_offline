package oops.abstraction;

public class ConstructorChaining {
}

class One {
	int i;
	String s;
	double d;

	public One(int i) {
		this.i = i;
	}

	public One(int i, String s) {
		this(i);
		this.s = s;
	}

	public One(int i, String s, double d) {
		this(i, s);
		this.d = d;
	}

	public One() {
		super();
	}

}

class Two extends One {
	float f;
	byte b;
	short s;

	public Two(float f, byte b, short s) {
		this(f, b);
		this.s = s;
	}

	public Two(float f, byte b) {
		super();

		this.f = f;
		this.b = b;
	}

	public Two(int i, float f) {
		super(i);
		this.f = f;

	}

}