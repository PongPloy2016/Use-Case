package com.hrskrs.stealthymvp.data;

import android.content.Context;

import com.hrskrs.stealthymvp.data.remote.api.ApiManger;
import com.hrskrs.stealthymvp.di.ApplicationContext;
import com.hrskrs.stealthymvp.model.Profile;
import com.hrskrs.stealthymvp.util.sharedprefs.SharedPrefsHelper;

import java.util.ArrayList;

import javax.inject.Inject;

import io.reactivex.Observable;

/**
 * Created by hrskrs on 4/28/2017.
 */
public class DataManagerImp implements DataManger {

  private Context context;
  private SharedPrefsHelper sharedPrefsHelper;
//  private DbManager dbManager;
  private ApiManger quoteApi;

  @Inject
  public DataManagerImp(@ApplicationContext Context context,
                        SharedPrefsHelper sharedPrefsHelper,
//                        DbManager dbManager,
                        ApiManger quoteApi) {
    this.context = context;
    this.sharedPrefsHelper = sharedPrefsHelper;
//    this.dbManager = dbManager;
    this.quoteApi = quoteApi;
  }

  @Override
  public Observable<ArrayList<Profile>> getProfiles() {
    return quoteApi.getProfiles();
  }
}