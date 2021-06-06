package com.example.a10118429_ruyatsyah.base;

//04 Juni 2021-10118429-Ruyatsyah-IF10
public interface IPresenter<T extends IView, IView> {
    void onAttach(T view);
    void onDetach();
}
