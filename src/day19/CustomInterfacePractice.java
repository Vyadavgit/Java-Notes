package day19;

import java.util.logging.Logger;

public class CustomInterfacePractice implements Adapter.ItemClickListener {
    public static void main(String[] args){
        Adapter adapter = new Adapter(new CustomInterfacePractice());
        adapter.onButtonClicked();
    }

    @Override
    public void onItemClicked(int position){
        Logger.getGlobal().info("On item clicked "+position);
    }
}
