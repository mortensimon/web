<#import "/unit-status/chart.ftl" as unitmacros>
<script src="javascript/xaps.module.unit.history.js" type="text/javascript"></script>
<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
<td valign="top" style="width:800px;">
	<div id="tabs">
    	<ul>
    		<li><a href="#voipDiv">Voip</a></li>
    		<li><a href="#hardwareDiv">Hardware</a></li>
    		<li><a href="#syslogDiv">Syslog</a></li>
    	</ul>
    	<div id="voipDiv" style="width:1280px;min-height:400px;">
    	    <@unitmacros.unitreportgraph type="Voip" methods=methodsForVoip />
    	</div>
    	<div id="hardwareDiv" style="width:1280px;min-height:400px">
    		<@unitmacros.unitreportgraph type="Hardware" methods=methodsForHardware />
    	</div>
    	<div id="syslogDiv" style="width:1280px;min-height:400px">
    		<@unitmacros.unitreportgraph type="Syslog" methods=methodsForSyslog />
    	</div>
    </div>
    <script>
         xAPS.unit.history.initSettings({
			selectedTab: ${selectedTab?default(0)},
			unitId: '${info.unit.id}',
			pageId: 'unit-dashboard'
         });
   </script>
</td>