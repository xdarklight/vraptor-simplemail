package br.com.caelum.vraptor.simplemail.testing;

import javax.enterprise.inject.Vetoed;

import freemarker.template.Configuration;
import br.com.caelum.vraptor.simplemail.template.TemplateMail;
import br.com.caelum.vraptor.simplemail.template.TemplateMailer;

@Vetoed
public class MockTemplateMailer implements TemplateMailer {

	@Override
	public TemplateMail template(String name, Object... nameParameters) {
		return new MockTemplateMail();
	}

	@Override
	public TemplateMailer with(Configuration configuration) {
		return this;
	}

}
