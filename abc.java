@Override
	public void onlowmemory() {
		AlertDialog dialog = new AlertDialog.Builder(this).create();
		dialog.setTitle("Low memory!");
		dialog.setMessage("Too many apps open, kindly close some other apps and try again!");
		dialog.setButton("Exit", new DialogInterface.OnClickListener() {
			
			public void onClick(DialogInterface dialog, int which) {
				
				finish();
				
			}
		});
		
		dialog.show();

		
		super.onLowMemory();
	}
