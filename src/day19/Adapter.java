package day19;

import java.util.logging.Logger;

public class Adapter {
    private ItemClickListener itemClickListener;

    public Adapter(ItemClickListener itemClickListener){
        this.itemClickListener = itemClickListener;
    }

    public void onButtonClicked(){
        // API Call
        // 5 second - 10 Second
        Logger.getGlobal().info("On button clicked");
        this.itemClickListener.onItemClicked(5);
    }

    interface ItemClickListener{
        void onItemClicked(int position);
    }
}
