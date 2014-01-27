<#if UNITTYPE_DROPDOWN.selected?? && PROFILE_DROPDOWN.selected?? && unit??>
<@macros.form>
	<iframe src="unitVoipSetup.wizard?unittype=${UNITTYPE_DROPDOWN.selected.name}&profile=${PROFILE_DROPDOWN.selected.name}&unit=${unit}" frameborder="0" width="100%" height="500px">
	
	</iframe>
</@macros.form>
<#else>
Unit Type and Profile is required
</#if>