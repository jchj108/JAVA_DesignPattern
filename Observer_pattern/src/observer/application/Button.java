package observer.application;

public class Button {
	
	public void onClick() {
		// �̺�Ʈ ó��
		if(onClickListener != null) {
			onClickListener.onClick(this);
		}
	}
	
	public interface OnClickListener {
		public void onClick(Button button);
	}
	
	private OnClickListener onClickListener;
	
	public void setOnClickListner(OnClickListener onClickListener) {
		this.onClickListener = onClickListener;
	}
}
