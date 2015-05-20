import lejos.hardware.motor.Motor;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3UltrasonicSensor;

public class Ev3ultra {

	static int a;

	public static void main(String[] args) {

		// TODO 自動生成されたメソッド・スタブ
//		getDistanceMode a;
		EV3UltrasonicSensor us1 = new EV3UltrasonicSensor(SensorPort.S4);

		Motor.B.setSpeed(100);// 2 RPM
        Motor.C.setSpeed(100);
        //a;f

		us1.enable();
		us1.getDistanceMode();





		us1.close();

	}




}

