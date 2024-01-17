package ch07;

public class Triangle extends Shape {
	
	Point[] p = new Point[3]; // �ﰢ���� ��ǥ 3�� �ʿ�

	Triangle(Point[] p) {
		// super(); // Circle Ŭ������ ����
		this.p = p;
	}

	// �θ� Ŭ���� Shape�� draw() �޼��� �������̵�
	void draw() {
		System.out.printf("[p1 = %s, p2 = %s, p3 = %s, color = %s]%n", 
				p[0].getXY(), p[1].getXY(), p[2].getXY(), color);
	}

}