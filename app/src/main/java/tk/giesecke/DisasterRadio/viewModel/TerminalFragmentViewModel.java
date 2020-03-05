package tk.giesecke.DisasterRadio.viewModel;

import android.view.View;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TerminalFragmentViewModel extends ViewModel {
    private MutableLiveData<Integer> chatLayoutVisibility;
    private MutableLiveData<Integer> mapLayoutVisibility;

    public TerminalFragmentViewModel() {
        this.chatLayoutVisibility = new MutableLiveData<>(View.VISIBLE);
        this.mapLayoutVisibility = new MutableLiveData<>(View.INVISIBLE);
    }


    public MutableLiveData<Integer> getChatLayoutVisibility() {
        return chatLayoutVisibility;
    }

    public MutableLiveData<Integer> getMapLayoutVisibility() {
        return mapLayoutVisibility;
    }
}
