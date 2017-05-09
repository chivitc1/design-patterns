package patterns.iterator;

public class Channel {
	private double frequency;
	private ChannelTypeEnum TYPE;

	public double getFrequency() {
		return frequency;
	}

	public void setFrequency(double frequency) {
		this.frequency = frequency;
	}

	public ChannelTypeEnum getTYPE() {
		return TYPE;
	}

	public void setTYPE(ChannelTypeEnum tYPE) {
		TYPE = tYPE;
	}

	public Channel(double frequency, ChannelTypeEnum tYPE) {
		this.frequency = frequency;
		TYPE = tYPE;
	}

	@Override
	public String toString() {
		return "Frequency=" + this.frequency + ", Type=" + this.TYPE;
	}
}
