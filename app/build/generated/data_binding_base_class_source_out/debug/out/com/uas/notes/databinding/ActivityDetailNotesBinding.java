// Generated by view binder compiler. Do not edit!
package com.uas.notes.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.uas.notes.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityDetailNotesBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final FloatingActionButton noteDetailAddBtn;

  @NonNull
  public final FloatingActionButton noteDetailBackBtn;

  @NonNull
  public final RecyclerView recycleNoteDetail;

  private ActivityDetailNotesBinding(@NonNull ConstraintLayout rootView,
      @NonNull FloatingActionButton noteDetailAddBtn,
      @NonNull FloatingActionButton noteDetailBackBtn, @NonNull RecyclerView recycleNoteDetail) {
    this.rootView = rootView;
    this.noteDetailAddBtn = noteDetailAddBtn;
    this.noteDetailBackBtn = noteDetailBackBtn;
    this.recycleNoteDetail = recycleNoteDetail;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityDetailNotesBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityDetailNotesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_detail_notes, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityDetailNotesBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.note_detail_add_btn;
      FloatingActionButton noteDetailAddBtn = ViewBindings.findChildViewById(rootView, id);
      if (noteDetailAddBtn == null) {
        break missingId;
      }

      id = R.id.note_detail_back_btn;
      FloatingActionButton noteDetailBackBtn = ViewBindings.findChildViewById(rootView, id);
      if (noteDetailBackBtn == null) {
        break missingId;
      }

      id = R.id.recycle_note_detail;
      RecyclerView recycleNoteDetail = ViewBindings.findChildViewById(rootView, id);
      if (recycleNoteDetail == null) {
        break missingId;
      }

      return new ActivityDetailNotesBinding((ConstraintLayout) rootView, noteDetailAddBtn,
          noteDetailBackBtn, recycleNoteDetail);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}