/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.accion.programaradio;

import com.culturaPococi.negocio.NegocioProgramaRadio;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

/**
 *
 * @author jonathan
 */
public class ListarProgramaRadio extends DispatchAction {

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {


        NegocioProgramaRadio npr = new NegocioProgramaRadio();

        request.setAttribute("listaProgramas", npr.listaProgramacionRadio());

        return mapping.getInputForward();

    }
}
