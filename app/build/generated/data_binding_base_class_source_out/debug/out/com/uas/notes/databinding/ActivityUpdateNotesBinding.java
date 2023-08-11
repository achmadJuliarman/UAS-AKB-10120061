// Generated by view binder compiler. Do not edit!
package com.uas.notes.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uas.notes.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityUpdateNotesBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button uptNoteBackBtn;

  @NonNull
  public final EditText uptNoteCategory;

  @NonNull
  public final EditText uptNoteDescription;

  @NonNull
  public final Button uptNoteSaveBtn;

  @NonNull
  public final EditText uptNoteTitle;

  private ActivityUpdateNotesBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button uptNoteBackBtn, @NonNull EditText uptNoteCategory,
      @NonNull EditText uptNoteDescription, @NonNull Button uptNoteSaveBtn,
      @NonNull EditText uptNoteTitle) {
    this.rootView = rootView;
    this.uptNoteBackBtn = uptNoteBackBtn;
    this.uptNoteCategory = uptNoteCategory;
    this.uptNoteDescription = uptNoteDescription;
    this.uptNoteSaveBtn = uptNoteSaveBtn;
    this.uptNoteTitle = uptNoteTitle;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityUpdateNotesBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityUpdateNotesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_update_notes, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityUpdateNotesBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.upt_note_back_btn;
      Button uptNoteBackBtn = ViewBindings.findChildViewById(rootView, id);
      if (uptNoteBackBtn == null) {
        break missingId;
      }

      id = R.id.upt_note_category;
      EditText uptNoteCategory = ViewBindings.findChildViewById(rootView, id);
      if (uptNoteCategory == null) {
        break missingId;
      }

      id = R.id.upt_note_description;
      EditText uptNoteDescription = ViewBindings.findChildViewById(rootView, id);
      if (uptNoteDescription == null) {
        break missingId;
      }

      id = R.id.upt_note_save_btn;
      Button uptNoteSaveBtn = ViewBindings.findChildViewById(rootView, id);
      if (uptNoteSaveBtn == null) {
        break missingId;
      }

      id = R.id.upt_note_title;
      EditText uptNoteTitle = ViewBindings.findChildViewById(rootView, id);
      if (uptNoteTitle == null) {
        break missingId;
      }

      return new ActivityUpdateNotesBinding((ConstraintLayout) rootView, uptNoteBackBtn,
          uptNoteCategory, uptNoteDescription, uptNoteSaveBtn, uptNoteTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}