package observer.application;

import observer.application.Button.OnClickListener;

public class Application {
	
	public static void main(String[] args) {
		
		Button button = new Button();
		
		button.setOnClickListner(new OnClickListener() {
			//익명 클래스
			@Override
			public void onClick(Button button) {
				System.out.println(button+" is Clicked");
			}
			
		});
		button.onClick();
	}
	
}

class ButtonClick implements OnClickListener {

	@Override
	public void onClick(Button button) {
		System.out.println(button + " is Clicked");
	}
}
