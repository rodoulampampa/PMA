package com.pma;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;

import java.text.BreakIterator;
import java.util.zip.Inflater;

public class ProjectDialogFragment extends DialogFragment {
    private IProjectDialFrag iProjDialFrag;
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder createProjectAlert = new AlertDialog.Builder(getActivity());

        createProjectAlert.setTitle("Add a name:");

        LayoutInflater inflater = getActivity().getLayoutInflater();

        View view = Inflater.minflate(R.layout.activity_project_dialog_fragment, null);
        EditText project_name = (EditText) view.findViewById(R.id.project_name);

        createProjectAlert.setView(inflater.inflate(R.layout.activity_project_dialog_fragment, null))

                .setPositiveButton(R.string.conti_nue, new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        BreakIterator editText = null;
                        String projectName = editText.getText().toString();
                        iProjDialFrag.onDialogPositiveClick(ProjectDialogFragment.this);
                    }
                })
                .setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        iProjDialFrag.onDialogNegativeClick(ProjectDialogFragment.this);

                    }
                });

        return createProjectAlert.create();
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        iProjDialFrag = (IProjectDialFrag) activity;
    }

}


interface IProjectDialFrag {

    void onDialogPositiveClick(DialogFragment dialog);
    void onDialogNegativeClick(DialogFragment dialog);

}