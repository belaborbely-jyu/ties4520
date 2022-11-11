/**
 * This software is copyrighted and licensed; see the accompanying license file for copyright holders and terms.
 */
package info.sswap.impl.empire.model;

import static info.sswap.impl.empire.Namespaces.SSWAP_NS;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;

import com.clarkparsia.empire.annotation.Namespaces;
import com.clarkparsia.empire.annotation.RdfsClass;

import info.sswap.api.model.SSWAPObject;
import info.sswap.api.model.SSWAPSubject;
import info.sswap.api.model.ValidationException;
import info.sswap.impl.empire.Vocabulary;

/**
 * The implementation of SSWAPObject. The missing abstract methods (if any) of this abstract class will be generated by
 * Empire.
 * 
 * @author Blazej Bulka <blazej@clarkparsia.com>
 */
@Namespaces( { "sswap", SSWAP_NS })
@Entity
@RdfsClass("sswap:Object")
public abstract class ObjectImpl extends EmpireGeneratedNodeImpl implements SSWAPObject {

	private Set<SubjectImpl> subjects = new HashSet<SubjectImpl>();
	
	public ObjectImpl() {
		addIgnoredType(Vocabulary.SSWAP_OBJECT.getURI());
	}
	
	/**
	 * @inheritDoc
	 */
	public SSWAPSubject getSubject() {
		if (!subjects.isEmpty()) {
			return subjects.iterator().next();
		}
		
		return null;
	}
	
	/**
	 * @inheritDoc
	 */
	public Collection<SSWAPSubject> getSubjects() {
		return listFromImpl(new ArrayList<SubjectImpl>(subjects), SSWAPSubject.class, SubjectImpl.class);
	}
	
	void addSubject(SSWAPSubject subject) {
		if (subject instanceof SubjectImpl) {
			subjects.add((SubjectImpl) subject);	
		}
		else {
			throw new IllegalArgumentException("The subject has not been created by this API implementation");
		}
	}
	
	void removeSubject(SSWAPSubject subject) {
		if (subject != null) {
			subjects.remove(subject);	
		}
		else {
			throw new IllegalArgumentException("The subject has not been created by this API implementation");
		}
	}
	
	@Override
	public void validate() throws ValidationException {
		super.validate();
	}
}