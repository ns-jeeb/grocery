
package android.databinding;
import com.jeeb.grocerymanager.BR;
class DataBinderMapper  {
    final static int TARGET_MIN_SDK = 16;
    public DataBinderMapper() {
    }
    public android.databinding.ViewDataBinding getDataBinder(android.databinding.DataBindingComponent bindingComponent, android.view.View view, int layoutId) {
        switch(layoutId) {
                case com.jeeb.grocerymanager.R.layout.items_pager:
                    return com.jeeb.grocerymanager.databinding.ItemsPagerBinding.bind(view, bindingComponent);
                case com.jeeb.grocerymanager.R.layout.activity_main:
                    return com.jeeb.grocerymanager.databinding.ActivityMainBinding.bind(view, bindingComponent);
                case com.jeeb.grocerymanager.R.layout.activity_pager_list:
                    return com.jeeb.grocerymanager.databinding.ActivityPagerListBinding.bind(view, bindingComponent);
                case com.jeeb.grocerymanager.R.layout.fragment_my_view_pager:
                    return com.jeeb.grocerymanager.databinding.FragmentMyViewPagerBinding.bind(view, bindingComponent);
                case com.jeeb.grocerymanager.R.layout.fragment1_my_view_pager:
                    return com.jeeb.grocerymanager.databinding.Fragment1MyViewPagerBinding.bind(view, bindingComponent);
                case com.jeeb.grocerymanager.R.layout.items:
                    return com.jeeb.grocerymanager.databinding.ItemsBinding.bind(view, bindingComponent);
                case com.jeeb.grocerymanager.R.layout.created_items:
                    return com.jeeb.grocerymanager.databinding.CreatedItemsBinding.bind(view, bindingComponent);
        }
        return null;
    }
    android.databinding.ViewDataBinding getDataBinder(android.databinding.DataBindingComponent bindingComponent, android.view.View[] views, int layoutId) {
        switch(layoutId) {
        }
        return null;
    }
    int getLayoutId(String tag) {
        if (tag == null) {
            return 0;
        }
        final int code = tag.hashCode();
        switch(code) {
            case -664530160: {
                if(tag.equals("layout/items_pager_0")) {
                    return com.jeeb.grocerymanager.R.layout.items_pager;
                }
                break;
            }
            case 423753077: {
                if(tag.equals("layout/activity_main_0")) {
                    return com.jeeb.grocerymanager.R.layout.activity_main;
                }
                break;
            }
            case 181252822: {
                if(tag.equals("layout/activity_pager_list_0")) {
                    return com.jeeb.grocerymanager.R.layout.activity_pager_list;
                }
                break;
            }
            case 440678947: {
                if(tag.equals("layout/fragment_my_view_pager_0")) {
                    return com.jeeb.grocerymanager.R.layout.fragment_my_view_pager;
                }
                break;
            }
            case 1081511882: {
                if(tag.equals("layout/fragment1_my_view_pager_0")) {
                    return com.jeeb.grocerymanager.R.layout.fragment1_my_view_pager;
                }
                break;
            }
            case 1080324492: {
                if(tag.equals("layout/items_0")) {
                    return com.jeeb.grocerymanager.R.layout.items;
                }
                break;
            }
            case 584246325: {
                if(tag.equals("layout/created_items_0")) {
                    return com.jeeb.grocerymanager.R.layout.created_items;
                }
                break;
            }
        }
        return 0;
    }
    String convertBrIdToString(int id) {
        if (id < 0 || id >= InnerBrLookup.sKeys.length) {
            return null;
        }
        return InnerBrLookup.sKeys[id];
    }
    private static class InnerBrLookup {
        static String[] sKeys = new String[]{
            "_all"};
    }
}