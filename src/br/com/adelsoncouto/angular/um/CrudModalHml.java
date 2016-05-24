package br.com.adelsoncouto.angular.um;

import br.com.adelsoncouto.componente.Modulo;

public class CrudModalHml {
	
	private Modulo modulo;

	public CrudModalHml(Modulo aModulo){
		this.modulo = aModulo;
		
	}
	
	public StringBuilder codigo(){
		StringBuilder sb = new StringBuilder(
				"<div class=\""+modulo.getClassPainel().getPainel()+"\">\n" + 
				"	<div class=\""+modulo.getClassPainel().getPainelCabecalho()+"\">\n" + 
				"		<h3 class=\""+modulo.getClassPainel().getPainelTitulo()+"\">"+modulo.getLabel()+"</h3>\n" + 
				"		<span>"+modulo.getDescricao()+"</span>\n" + 
				"	</div>\n" + 
				"	<div class=\""+modulo.getClassPainel().getPainelBody()+"\">\n" + 
				
				"	\n" + 
				"	</div>\n" + 
				"	<div class=\""+modulo.getClassPainel().getPainelRodape()+"\">\n" + 
				"\n" + 
				"	</div>\n" + 
				"</div>"
				+ "\n\n");
		sb.append(gerarModalCriar());
		sb.append(gerarModalEditar());
		sb.append(gerarModalDeletar());
		
		return sb;
		
	}
	
	private String gerarModalDeletar() {
		String t = "<div class=\"modal fade\" tabindex=\"-1\" role=\"dialog\" id=\"modal-deletar\">\n" + 
				"  <div class=\"modal-dialog\">\n" + 
				"    <div class=\"modal-content\">\n" + 
				"      <div class=\"modal-header\">\n" + 
				"        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\n" + 
				"        <h4 class=\"modal-title\">Modal title</h4>\n" + 
				"      </div>\n" + 
				"      <div class=\"modal-body\">\n" + 
				"        <p>One fine body&hellip;</p>\n" + 
				"      </div>\n" + 
				"      <div class=\"modal-footer\">\n" + 
				"        <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\n" + 
				"        <button type=\"button\" class=\"btn btn-primary\">Save changes</button>\n" + 
				"      </div>\n" + 
				"    </div>\n" + 
				"  </div>\n" + 
				"</div>\n\n";
		return t;
	}

	private String gerarModalEditar() {
		String t = "<div class=\"modal fade\" tabindex=\"-1\" role=\"dialog\" id=\"modal-editar\">\n" + 
				"  <div class=\"modal-dialog\">\n" + 
				"    <div class=\"modal-content\">\n" + 
				"      <div class=\"modal-header\">\n" + 
				"        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\n" + 
				"        <h4 class=\"modal-title\">Modal title</h4>\n" + 
				"      </div>\n" + 
				"      <div class=\"modal-body\">\n" + 
				"        <p>One fine body&hellip;</p>\n" + 
				"      </div>\n" + 
				"      <div class=\"modal-footer\">\n" + 
				"        <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\n" + 
				"        <button type=\"button\" class=\"btn btn-primary\">Save changes</button>\n" + 
				"      </div>\n" + 
				"    </div>\n" + 
				"  </div>\n" + 
				"</div>\n\n";
		return t;
	}

	private String gerarModalCriar() {
		String t = "<div class=\"modal fade\" tabindex=\"-1\" role=\"dialog\" id=\"modal-criar\">\n" + 
				"  <div class=\"modal-dialog\">\n" + 
				"    <div class=\"modal-content\">\n" + 
				"      <div class=\"modal-header\">\n" + 
				"        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\n" + 
				"        <h4 class=\"modal-title\">Modal title</h4>\n" + 
				"      </div>\n" + 
				"      <div class=\"modal-body\">\n" + 
				"        <p>One fine body&hellip;</p>\n" + 
				"      </div>\n" + 
				"      <div class=\"modal-footer\">\n" + 
				"        <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\n" + 
				"        <button type=\"button\" class=\"btn btn-primary\">Save changes</button>\n" + 
				"      </div>\n" + 
				"    </div>\n" + 
				"  </div>\n" + 
				"</div>\n\n";
		return t;
	}
}
