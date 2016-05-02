package com.example.shape;



import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class bmifragment extends Fragment {
	
	//EditText age ;
    EditText weight ;
    EditText height ;
	EditText results ;
   // RadioGroup gender ;
	Button result;
	double valueheight =0;
	double valueweight =0 ;
	double bmi =0 ;
    int w , h , a ;
    
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		 final View v = inflater.inflate(R.layout.fragment_bmi, container, false);
	   //  age = (EditText) v.findViewById(R.id.age);
	    weight = (EditText) v.findViewById(R.id.weight);
	    height = (EditText) v.findViewById(R.id.height);
	   // gender = (RadioGroup) v.findViewById(R.id.gender);
		results = (EditText) v.findViewById(R.id.results);
		result = (Button) v.findViewById(R.id.result);


		result.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {

				calculate();
				valueheight = Double.parseDouble(height.getText().toString());
				valueheight = valueheight/100;

				valueweight = Double.parseDouble(weight.getText().toString());

				bmi = (valueweight/ (valueheight * valueheight));

				results.setText(Double.toString(bmi));


			}
		});


	  // String temp1 = "";
	  // String temp2 = "";
	  // String temp3 = "";
	   
	 //  temp1.equals(weight.getText().toString());
	 //   temp2.equals(height.getText().toString());
	//    temp3.equals(age.getText().toString()) ;
	   
	 //  w= Integer.parseInt(temp1);
	//   h = Integer.parseInt( temp2);
	//   a = Integer.parseInt(temp3);
	   
	//   Toast.makeText(getActivity(), w + "is "+ h + a, Toast.LENGTH_LONG).show();
	   
		 return v;
		 
	}

	private void calculate(){


	}
	@Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

       
    }

	@Override
	public void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
	}

	

}
