<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"                                 
                version="1.0">
    <xsl:output method="html" indent="yes" encoding="UTF-8" omit-xml-declaration="yes"/>
    <xsl:template match="/">
        <html>            
            <body>
                <xsl:apply-templates/>
            </body>
        </html>
    </xsl:template>
    <xsl:template match="dataList" > 
        <xsl:for-each select="model">
            <div style="margin: 5px;;width: 150px;height: 250px;float: left;">
                <a href="controller?action=viewDetail&amp;id={id}" 
                   style="text-decoration: none;">
                    <img style="width: 135px;height: 180px;">
                        <xsl:attribute name="src">
                            <xsl:value-of select="imageUrl"/>
                        </xsl:attribute>
                        <p style="margin: 0px;">
                            <xsl:value-of select="name"/>
                        </p>
                        <font>
                            <xsl:value-of select="price"/> VND
                        </font>
                    </img>
                </a>                
            </div>
        </xsl:for-each> 
    </xsl:template>
    
    <xsl:template match="pageNumber"/>
    <xsl:template match="pageSize"/>
    <xsl:template match="totalPage"/>
    <xsl:template match="totalElements"/>
    <xsl:template match="numberOfElements"/>
</xsl:stylesheet>
