package patterns.iterator;

import java.util.ArrayList;
import java.util.List;

public class ChannelCollectionImpl implements IChannelCollection {

	private List<Channel> channelsList;
	
	public ChannelCollectionImpl(){
		channelsList = new ArrayList<>();
	}
	@Override
	public void addChannel(Channel c) {
		this.channelsList.add(c);
	}

	@Override
	public void removeChannel(Channel c) {
		this.channelsList.remove(c);
	}

	@Override
	public IChannelIterator iterator(ChannelTypeEnum type) {

		return new ChannelIteratorImpl(type, this.channelsList);
	}

	private class ChannelIteratorImpl implements IChannelIterator {

		private ChannelTypeEnum type;
		private List<Channel> channels;
		private int position=0;
		
		public ChannelIteratorImpl(ChannelTypeEnum type, List<Channel> channels) {
			this.type = type;
			this.channels = channels;
		}

		@Override
		public boolean hasNext() {
			while(position < this.channels.size()){
				Channel c = this.channels.get(position);
				if(c.getTYPE().equals(this.type) 
						|| this.type.equals(ChannelTypeEnum.ALL)){
					return true;
				} else{
					position++;
				}					
			}
			return false;
		}

		@Override
		public Channel next() {
			Channel c = channels.get(position);
			position++;
			return c;
		}
		
	}
}
