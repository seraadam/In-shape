package in.shape;



import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;


public class bmifragment extends Fragment {
	
	EditText age ;
    EditText weight ;
    EditText height ;
    EditText gender ;
    int w , h , a ;
    
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		 final View v = inflater.inflate(R.layout.fragment_bmi, container, false);
	     age = (EditText) v.findViewById(R.id.age);
	    weight = (EditText) v.findViewById(R.id.weight);
	    height = (EditText) v.findViewById(R.id.height);
	    gender = (EditText) v.findViewById(R.id.gender);
	     
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
