package patterns.adapter;

public class SocketObjectAdapterImpl implements SocketAdapter {

	// Composition approach
	private Socket socket = new Socket();

	@Override
	public Volt get120Volt() {
		// TODO Auto-generated method stub
		return socket.getVolt();
	}

	@Override
	public Volt get12Volt() {
		// TODO Auto-generated method stub
		return convertVolt(socket.getVolt(), 10);
	}

	@Override
	public Volt get3Volt() {
		// TODO Auto-generated method stub
		return convertVolt(socket.getVolt(), 40);
	}

	private Volt convertVolt(Volt v, int i) {
		return new Volt(v.getVolts() / i);
	}
}
