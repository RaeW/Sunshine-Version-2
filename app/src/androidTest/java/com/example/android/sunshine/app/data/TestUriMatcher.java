



<!DOCTYPE html>
<html lang="en" class=" is-copy-enabled">
  <head prefix="og: http://ogp.me/ns# fb: http://ogp.me/ns/fb# object: http://ogp.me/ns/object# article: http://ogp.me/ns/article# profile: http://ogp.me/ns/profile#">
    <meta charset='utf-8'>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta http-equiv="Content-Language" content="en">
    <meta name="viewport" content="width=1020">
    
    
    <title>Sunshine-Version-2/TestUriMatcher.java at lesson_4_content_provider_starter_code · udacity/Sunshine-Version-2</title>
    <link rel="search" type="application/opensearchdescription+xml" href="/opensearch.xml" title="GitHub">
    <link rel="fluid-icon" href="https://github.com/fluidicon.png" title="GitHub">
    <link rel="apple-touch-icon" sizes="57x57" href="/apple-touch-icon-114.png">
    <link rel="apple-touch-icon" sizes="114x114" href="/apple-touch-icon-114.png">
    <link rel="apple-touch-icon" sizes="72x72" href="/apple-touch-icon-144.png">
    <link rel="apple-touch-icon" sizes="144x144" href="/apple-touch-icon-144.png">
    <meta property="fb:app_id" content="1401488693436528">

      <meta content="@github" name="twitter:site" /><meta content="summary" name="twitter:card" /><meta content="udacity/Sunshine-Version-2" name="twitter:title" /><meta content="Sunshine-Version-2 - The official repository for Developing Android Apps" name="twitter:description" /><meta content="https://avatars3.githubusercontent.com/u/1916665?v=3&amp;s=400" name="twitter:image:src" />
      <meta content="GitHub" property="og:site_name" /><meta content="object" property="og:type" /><meta content="https://avatars3.githubusercontent.com/u/1916665?v=3&amp;s=400" property="og:image" /><meta content="udacity/Sunshine-Version-2" property="og:title" /><meta content="https://github.com/udacity/Sunshine-Version-2" property="og:url" /><meta content="Sunshine-Version-2 - The official repository for Developing Android Apps" property="og:description" />
      <meta name="browser-stats-url" content="https://api.github.com/_private/browser/stats">
    <meta name="browser-errors-url" content="https://api.github.com/_private/browser/errors">
    <link rel="assets" href="https://assets-cdn.github.com/">
    <link rel="web-socket" href="wss://live.github.com/_sockets/ODU4MzY1ODplOTU2NGYyNzI1YTYzYWM3ODg1NDlmNTg0OTQ3YTFkNDo2NmZkNmQwY2Q1Mjk4NWI1NzAzZWRlYTU2NGNjNjdlYmIxOTVkMDZiYTI3YjQ5YTc5NTczNDlmYjk1OGVlMDc0--632eff4969e32c451175208cd8f2bbb1de43dbbc">
    <meta name="pjax-timeout" content="1000">
    <link rel="sudo-modal" href="/sessions/sudo_modal">

    <meta name="msapplication-TileImage" content="/windows-tile.png">
    <meta name="msapplication-TileColor" content="#ffffff">
    <meta name="selected-link" value="repo_source" data-pjax-transient>

    <meta name="google-site-verification" content="KT5gs8h0wvaagLKAVWq8bbeNwnZZK1r1XQysX3xurLU">
    <meta name="google-analytics" content="UA-3769691-2">

<meta content="collector.githubapp.com" name="octolytics-host" /><meta content="github" name="octolytics-app-id" /><meta content="47CDA429:4080:84BF418:5664D978" name="octolytics-dimension-request_id" /><meta content="8583658" name="octolytics-actor-id" /><meta content="RaeW" name="octolytics-actor-login" /><meta content="585a6e7d16b780ff9dd0d041bf994811a8a02ac3027f6b9d7692460b68abed9b" name="octolytics-actor-hash" />
<meta content="/&lt;user-name&gt;/&lt;repo-name&gt;/blob/show" data-pjax-transient="true" name="analytics-location" />
<meta content="Rails, view, blob#show" data-pjax-transient="true" name="analytics-event" />


  <meta class="js-ga-set" name="dimension1" content="Logged In">



        <meta name="hostname" content="github.com">
    <meta name="user-login" content="RaeW">

        <meta name="expected-hostname" content="github.com">

      <link rel="mask-icon" href="https://assets-cdn.github.com/pinned-octocat.svg" color="#4078c0">
      <link rel="icon" type="image/x-icon" href="https://assets-cdn.github.com/favicon.ico">

    <meta content="f932e609a7aba515788282d5f65b552073ae4757" name="form-nonce" />

    <link crossorigin="anonymous" href="https://assets-cdn.github.com/assets/github-980086798633a7804d9e6353689ba4c79120d0f4a6264214d08411a5f3c6116a.css" media="all" rel="stylesheet" />
    <link crossorigin="anonymous" href="https://assets-cdn.github.com/assets/github2-e8884d9e57e2b8a7a08c24b9472e770d594a80d295ec923fc734d3da544eef73.css" media="all" rel="stylesheet" />
    
    
    


    <meta http-equiv="x-pjax-version" content="54a3408bfbdaab0b7780f3ce09e8c3d4">

      
  <meta name="description" content="Sunshine-Version-2 - The official repository for Developing Android Apps">
  <meta name="go-import" content="github.com/udacity/Sunshine-Version-2 git https://github.com/udacity/Sunshine-Version-2.git">

  <meta content="1916665" name="octolytics-dimension-user_id" /><meta content="udacity" name="octolytics-dimension-user_login" /><meta content="31690108" name="octolytics-dimension-repository_id" /><meta content="udacity/Sunshine-Version-2" name="octolytics-dimension-repository_nwo" /><meta content="true" name="octolytics-dimension-repository_public" /><meta content="false" name="octolytics-dimension-repository_is_fork" /><meta content="31690108" name="octolytics-dimension-repository_network_root_id" /><meta content="udacity/Sunshine-Version-2" name="octolytics-dimension-repository_network_root_nwo" />
  <link href="https://github.com/udacity/Sunshine-Version-2/commits/lesson_4_content_provider_starter_code.atom" rel="alternate" title="Recent Commits to Sunshine-Version-2:lesson_4_content_provider_starter_code" type="application/atom+xml">

  </head>


  <body class="logged_in   env-production windows vis-public page-blob">
    <a href="#start-of-content" tabindex="1" class="accessibility-aid js-skip-to-content">Skip to content</a>

    
    
    



      <div class="header header-logged-in true" role="banner">
  <div class="container clearfix">

    <a class="header-logo-invertocat" href="https://github.com/" data-hotkey="g d" aria-label="Homepage" data-ga-click="Header, go to dashboard, icon:logo">
  <span class="mega-octicon octicon-mark-github"></span>
</a>


      <div class="site-search repo-scope js-site-search" role="search">
          <!-- </textarea> --><!-- '"` --><form accept-charset="UTF-8" action="/udacity/Sunshine-Version-2/search" class="js-site-search-form" data-global-search-url="/search" data-repo-search-url="/udacity/Sunshine-Version-2/search" method="get"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /></div>
  <label class="js-chromeless-input-container form-control">
    <div class="scope-badge">This repository</div>
    <input type="text"
      class="js-site-search-focus js-site-search-field is-clearable chromeless-input"
      data-hotkey="s"
      name="q"
      placeholder="Search"
      aria-label="Search this repository"
      data-global-scope-placeholder="Search GitHub"
      data-repo-scope-placeholder="Search"
      tabindex="1"
      autocapitalize="off">
  </label>
</form>
      </div>

      <ul class="header-nav left" role="navigation">
        <li class="header-nav-item">
          <a href="/pulls" class="js-selected-navigation-item header-nav-link" data-ga-click="Header, click, Nav menu - item:pulls context:user" data-hotkey="g p" data-selected-links="/pulls /pulls/assigned /pulls/mentioned /pulls">
            Pull requests
</a>        </li>
        <li class="header-nav-item">
          <a href="/issues" class="js-selected-navigation-item header-nav-link" data-ga-click="Header, click, Nav menu - item:issues context:user" data-hotkey="g i" data-selected-links="/issues /issues/assigned /issues/mentioned /issues">
            Issues
</a>        </li>
          <li class="header-nav-item">
            <a class="header-nav-link" href="https://gist.github.com/" data-ga-click="Header, go to gist, text:gist">Gist</a>
          </li>
      </ul>

    
<ul class="header-nav user-nav right" id="user-links">
  <li class="header-nav-item">
      <span class="js-socket-channel js-updatable-content"
        data-channel="notification-changed:RaeW"
        data-url="/notifications/header">
      <a href="/notifications" aria-label="You have no unread notifications" class="header-nav-link notification-indicator tooltipped tooltipped-s" data-ga-click="Header, go to notifications, icon:read" data-hotkey="g n">
          <span class="mail-status all-read"></span>
          <span class="octicon octicon-bell"></span>
</a>  </span>

  </li>

  <li class="header-nav-item dropdown js-menu-container">
    <a class="header-nav-link tooltipped tooltipped-s js-menu-target" href="/new"
       aria-label="Create new…"
       data-ga-click="Header, create new, icon:add">
      <span class="octicon octicon-plus left"></span>
      <span class="dropdown-caret"></span>
    </a>

    <div class="dropdown-menu-content js-menu-content">
      <ul class="dropdown-menu dropdown-menu-sw">
        
<a class="dropdown-item" href="/new" data-ga-click="Header, create new repository">
  New repository
</a>


  <a class="dropdown-item" href="/organizations/new" data-ga-click="Header, create new organization">
    New organization
  </a>



  <div class="dropdown-divider"></div>
  <div class="dropdown-header">
    <span title="udacity/Sunshine-Version-2">This repository</span>
  </div>
    <a class="dropdown-item" href="/udacity/Sunshine-Version-2/issues/new" data-ga-click="Header, create new issue">
      New issue
    </a>

      </ul>
    </div>
  </li>

  <li class="header-nav-item dropdown js-menu-container">
    <a class="header-nav-link name tooltipped tooltipped-sw js-menu-target" href="/RaeW"
       aria-label="View profile and more"
       data-ga-click="Header, show menu, icon:avatar">
      <img alt="@RaeW" class="avatar" height="20" src="https://avatars1.githubusercontent.com/u/8583658?v=3&amp;s=40" width="20" />
      <span class="dropdown-caret"></span>
    </a>

    <div class="dropdown-menu-content js-menu-content">
      <div class="dropdown-menu  dropdown-menu-sw">
        <div class=" dropdown-header header-nav-current-user css-truncate">
            Signed in as <strong class="css-truncate-target">RaeW</strong>

        </div>


        <div class="dropdown-divider"></div>

          <a class="dropdown-item" href="/RaeW" data-ga-click="Header, go to profile, text:your profile">
            Your profile
          </a>
        <a class="dropdown-item" href="/stars" data-ga-click="Header, go to starred repos, text:your stars">
          Your stars
        </a>
        <a class="dropdown-item" href="/explore" data-ga-click="Header, go to explore, text:explore">
          Explore
        </a>
          <a class="dropdown-item" href="/integrations" data-ga-click="Header, go to integrations, text:integrations">
            Integrations
          </a>
        <a class="dropdown-item" href="https://help.github.com" data-ga-click="Header, go to help, text:help">
          Help
        </a>

          <div class="dropdown-divider"></div>

          <a class="dropdown-item" href="/settings/profile" data-ga-click="Header, go to settings, icon:settings">
            Settings
          </a>

          <!-- </textarea> --><!-- '"` --><form accept-charset="UTF-8" action="/logout" class="logout-form" data-form-nonce="f932e609a7aba515788282d5f65b552073ae4757" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="3Qt7aJtwYEjewvuEkfRF3TSEFbCU2wiDSjUo3BYm2mk01eGxPYdU4l4bf8lrc4Nsf0WFFeHEBmMWr9RLLf3wNQ==" /></div>
            <button class="dropdown-item dropdown-signout" data-ga-click="Header, sign out, icon:logout">
              Sign out
            </button>
</form>
      </div>
    </div>
  </li>
</ul>


    
  </div>
</div>

      

      


    <div id="start-of-content" class="accessibility-aid"></div>

    <div id="js-flash-container">
</div>


    <div role="main" class="main-content">
        <div itemscope itemtype="http://schema.org/WebPage">
    <div id="js-repo-pjax-container" class="context-loader-container js-repo-nav-next" data-pjax-container>
      
<div class="pagehead repohead instapaper_ignore readability-menu experiment-repo-nav">
  <div class="container repohead-details-container">

    

<ul class="pagehead-actions">

  <li>
        <!-- </textarea> --><!-- '"` --><form accept-charset="UTF-8" action="/notifications/subscribe" class="js-social-container" data-autosubmit="true" data-form-nonce="f932e609a7aba515788282d5f65b552073ae4757" data-remote="true" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="b9sIzuEgjQBl17Ubn7NruXVnNrAeLUN9CoWliWqv6KBiGuIpwjVYqRvbQ35lv6sHUwtZ0/nqH4Yzh2PvQHqi7g==" /></div>      <input id="repository_id" name="repository_id" type="hidden" value="31690108" />

        <div class="select-menu js-menu-container js-select-menu">
          <a href="/udacity/Sunshine-Version-2/subscription"
            class="btn btn-sm btn-with-count select-menu-button js-menu-target" role="button" tabindex="0" aria-haspopup="true"
            data-ga-click="Repository, click Watch settings, action:blob#show">
            <span class="js-select-button">
              <span class="octicon octicon-eye"></span>
              Watch
            </span>
          </a>
          <a class="social-count js-social-count" href="/udacity/Sunshine-Version-2/watchers">
            346
          </a>

        <div class="select-menu-modal-holder">
          <div class="select-menu-modal subscription-menu-modal js-menu-content" aria-hidden="true">
            <div class="select-menu-header">
              <span class="octicon octicon-x js-menu-close" role="button" aria-label="Close"></span>
              <span class="select-menu-title">Notifications</span>
            </div>

              <div class="select-menu-list js-navigation-container" role="menu">

                <div class="select-menu-item js-navigation-item selected" role="menuitem" tabindex="0">
                  <span class="select-menu-item-icon octicon octicon-check"></span>
                  <div class="select-menu-item-text">
                    <input checked="checked" id="do_included" name="do" type="radio" value="included" />
                    <span class="select-menu-item-heading">Not watching</span>
                    <span class="description">Be notified when participating or @mentioned.</span>
                    <span class="js-select-button-text hidden-select-button-text">
                      <span class="octicon octicon-eye"></span>
                      Watch
                    </span>
                  </div>
                </div>

                <div class="select-menu-item js-navigation-item " role="menuitem" tabindex="0">
                  <span class="select-menu-item-icon octicon octicon octicon-check"></span>
                  <div class="select-menu-item-text">
                    <input id="do_subscribed" name="do" type="radio" value="subscribed" />
                    <span class="select-menu-item-heading">Watching</span>
                    <span class="description">Be notified of all conversations.</span>
                    <span class="js-select-button-text hidden-select-button-text">
                      <span class="octicon octicon-eye"></span>
                      Unwatch
                    </span>
                  </div>
                </div>

                <div class="select-menu-item js-navigation-item " role="menuitem" tabindex="0">
                  <span class="select-menu-item-icon octicon octicon-check"></span>
                  <div class="select-menu-item-text">
                    <input id="do_ignore" name="do" type="radio" value="ignore" />
                    <span class="select-menu-item-heading">Ignoring</span>
                    <span class="description">Never be notified.</span>
                    <span class="js-select-button-text hidden-select-button-text">
                      <span class="octicon octicon-mute"></span>
                      Stop ignoring
                    </span>
                  </div>
                </div>

              </div>

            </div>
          </div>
        </div>
</form>
  </li>

  <li>
    
  <div class="js-toggler-container js-social-container starring-container ">

    <!-- </textarea> --><!-- '"` --><form accept-charset="UTF-8" action="/udacity/Sunshine-Version-2/unstar" class="js-toggler-form starred js-unstar-button" data-form-nonce="f932e609a7aba515788282d5f65b552073ae4757" data-remote="true" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="1lm55c/L1TCQhGXYTrLdulWPXbZMljoCesqnLBLmpiB4LdPaUxSf4s11/7j8hs2Q3xEKqboGo3IzoaRVUkfMyw==" /></div>
      <button
        class="btn btn-sm btn-with-count js-toggler-target"
        aria-label="Unstar this repository" title="Unstar udacity/Sunshine-Version-2"
        data-ga-click="Repository, click unstar button, action:blob#show; text:Unstar">
        <span class="octicon octicon-star"></span>
        Unstar
      </button>
        <a class="social-count js-social-count" href="/udacity/Sunshine-Version-2/stargazers">
          1,171
        </a>
</form>
    <!-- </textarea> --><!-- '"` --><form accept-charset="UTF-8" action="/udacity/Sunshine-Version-2/star" class="js-toggler-form unstarred js-star-button" data-form-nonce="f932e609a7aba515788282d5f65b552073ae4757" data-remote="true" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="VtleAGiDQuDATqPNwTLcCjlNuN9ACaYMOBJXZvYNEYA9X99SHnPDDsqDKqtJU6yPsPVi3QxWmuC3/NyQsLCf3A==" /></div>
      <button
        class="btn btn-sm btn-with-count js-toggler-target"
        aria-label="Star this repository" title="Star udacity/Sunshine-Version-2"
        data-ga-click="Repository, click star button, action:blob#show; text:Star">
        <span class="octicon octicon-star"></span>
        Star
      </button>
        <a class="social-count js-social-count" href="/udacity/Sunshine-Version-2/stargazers">
          1,171
        </a>
</form>  </div>

  </li>

  <li>
          <!-- </textarea> --><!-- '"` --><form accept-charset="UTF-8" action="/udacity/Sunshine-Version-2/fork" class="btn-with-count" data-form-nonce="f932e609a7aba515788282d5f65b552073ae4757" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="ZMynEoFNHx1PL+hYvosIOYquw2m/4E5VCZ6+yV3V2jny8AahvVqxCctB9EjeqM+G3AdPpx46HM8Jbh4zA6EcoQ==" /></div>
            <button
                type="submit"
                class="btn btn-sm btn-with-count"
                data-ga-click="Repository, show fork modal, action:blob#show; text:Fork"
                title="Fork your own copy of udacity/Sunshine-Version-2 to your account"
                aria-label="Fork your own copy of udacity/Sunshine-Version-2 to your account">
              <span class="octicon octicon-repo-forked"></span>
              Fork
            </button>
</form>
    <a href="/udacity/Sunshine-Version-2/network" class="social-count">
      2,149
    </a>
  </li>
</ul>

    <h1 itemscope itemtype="http://data-vocabulary.org/Breadcrumb" class="entry-title public ">
  <span class="octicon octicon-repo"></span>
  <span class="author"><a href="/udacity" class="url fn" itemprop="url" rel="author"><span itemprop="title">udacity</span></a></span><!--
--><span class="path-divider">/</span><!--
--><strong><a href="/udacity/Sunshine-Version-2" data-pjax="#js-repo-pjax-container">Sunshine-Version-2</a></strong>

  <span class="page-context-loader">
    <img alt="" height="16" src="https://assets-cdn.github.com/images/spinners/octocat-spinner-32.gif" width="16" />
  </span>

</h1>

  </div>
  <div class="container">
    
<nav class="reponav js-repo-nav js-sidenav-container-pjax js-octicon-loaders"
     role="navigation"
     data-pjax="#js-repo-pjax-container"
     data-issue-count-url="/udacity/Sunshine-Version-2/issues/counts">

  <a href="/udacity/Sunshine-Version-2/tree/lesson_4_content_provider_starter_code" aria-label="Code" aria-selected="true" class="js-selected-navigation-item selected reponav-item" data-hotkey="g c" data-selected-links="repo_source repo_downloads repo_commits repo_releases repo_tags repo_branches /udacity/Sunshine-Version-2/tree/lesson_4_content_provider_starter_code">
    <span class="octicon octicon-code"></span>
    Code
</a>
    <a href="/udacity/Sunshine-Version-2/issues" class="js-selected-navigation-item reponav-item" data-hotkey="g i" data-selected-links="repo_issues repo_labels repo_milestones /udacity/Sunshine-Version-2/issues">
      <span class="octicon octicon-issue-opened"></span>
      Issues
      <span class="counter">14</span>

</a>
  <a href="/udacity/Sunshine-Version-2/pulls" class="js-selected-navigation-item reponav-item" data-hotkey="g p" data-selected-links="repo_pulls /udacity/Sunshine-Version-2/pulls">
    <span class="octicon octicon-git-pull-request"></span>
    Pull requests
    <span class="counter">62</span>

</a>
    <a href="/udacity/Sunshine-Version-2/wiki" class="js-selected-navigation-item reponav-item" data-hotkey="g w" data-selected-links="repo_wiki /udacity/Sunshine-Version-2/wiki">
      <span class="octicon octicon-book"></span>
      Wiki
</a>
  <a href="/udacity/Sunshine-Version-2/pulse" class="js-selected-navigation-item reponav-item" data-selected-links="pulse /udacity/Sunshine-Version-2/pulse">
    <span class="octicon octicon-pulse"></span>
    Pulse
</a>
  <a href="/udacity/Sunshine-Version-2/graphs" class="js-selected-navigation-item reponav-item" data-selected-links="repo_graphs repo_contributors /udacity/Sunshine-Version-2/graphs">
    <span class="octicon octicon-graph"></span>
    Graphs
</a>

</nav>

  </div>
</div>

<div class="container new-discussion-timeline experiment-repo-nav">
  <div class="repository-content">

    

<a href="/udacity/Sunshine-Version-2/blob/1578a360189e9e929004894ed3e8f2210b7db8a7/TestUriMatcher.java" class="hidden js-permalink-shortcut" data-hotkey="y">Permalink</a>

<!-- blob contrib key: blob_contributors:v21:99c7b8f0337c1f8d3c2c7b4f83e9c80f -->

<div class="file-navigation js-zeroclipboard-container">
  
<div class="select-menu js-menu-container js-select-menu left">
  <button class="btn btn-sm select-menu-button js-menu-target css-truncate" data-hotkey="w"
    title="lesson_4_content_provider_starter_code"
    type="button" aria-label="Switch branches or tags" tabindex="0" aria-haspopup="true">
    <i>Branch:</i>
    <span class="js-select-button css-truncate-target">lesson_4_conte…</span>
  </button>

  <div class="select-menu-modal-holder js-menu-content js-navigation-container" data-pjax aria-hidden="true">

    <div class="select-menu-modal">
      <div class="select-menu-header">
        <span class="octicon octicon-x js-menu-close" role="button" aria-label="Close"></span>
        <span class="select-menu-title">Switch branches/tags</span>
      </div>

      <div class="select-menu-filters">
        <div class="select-menu-text-filter">
          <input type="text" aria-label="Filter branches/tags" id="context-commitish-filter-field" class="js-filterable-field js-navigation-enable" placeholder="Filter branches/tags">
        </div>
        <div class="select-menu-tabs">
          <ul>
            <li class="select-menu-tab">
              <a href="#" data-tab-filter="branches" data-filter-placeholder="Filter branches/tags" class="js-select-menu-tab" role="tab">Branches</a>
            </li>
            <li class="select-menu-tab">
              <a href="#" data-tab-filter="tags" data-filter-placeholder="Find a tag…" class="js-select-menu-tab" role="tab">Tags</a>
            </li>
          </ul>
        </div>
      </div>

      <div class="select-menu-list select-menu-tab-bucket js-select-menu-tab-bucket" data-tab-filter="branches" role="menu">

        <div data-filterable-for="context-commitish-filter-field" data-filterable-type="substring">


            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/1.01_hello_world/TestUriMatcher.java"
               data-name="1.01_hello_world"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="1.01_hello_world">
                1.01_hello_world
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/1.02_add_list_item_forecast_layout/TestUriMatcher.java"
               data-name="1.02_add_list_item_forecast_layout"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="1.02_add_list_item_forecast_layout">
                1.02_add_list_item_forecast_layout
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/1.03_update_fragment_layout/TestUriMatcher.java"
               data-name="1.03_update_fragment_layout"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="1.03_update_fragment_layout">
                1.03_update_fragment_layout
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/1.04_add_dummy_data/TestUriMatcher.java"
               data-name="1.04_add_dummy_data"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="1.04_add_dummy_data">
                1.04_add_dummy_data
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/1.05_create_arrayadapter/TestUriMatcher.java"
               data-name="1.05_create_arrayadapter"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="1.05_create_arrayadapter">
                1.05_create_arrayadapter
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/1.06_attach_adapter/TestUriMatcher.java"
               data-name="1.06_attach_adapter"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="1.06_attach_adapter">
                1.06_attach_adapter
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/2.01_add_network_code/TestUriMatcher.java"
               data-name="2.01_add_network_code"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="2.01_add_network_code">
                2.01_add_network_code
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/2.02_refactor_forecast_fragment/TestUriMatcher.java"
               data-name="2.02_refactor_forecast_fragment"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="2.02_refactor_forecast_fragment">
                2.02_refactor_forecast_fragment
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/2.03_add_refresh_xml/TestUriMatcher.java"
               data-name="2.03_add_refresh_xml"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="2.03_add_refresh_xml">
                2.03_add_refresh_xml
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/2.04_inflate_menu/TestUriMatcher.java"
               data-name="2.04_inflate_menu"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="2.04_inflate_menu">
                2.04_inflate_menu
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/2.05_execute_fetchweathertask/TestUriMatcher.java"
               data-name="2.05_execute_fetchweathertask"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="2.05_execute_fetchweathertask">
                2.05_execute_fetchweathertask
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/2.06_add_internet_permissions/TestUriMatcher.java"
               data-name="2.06_add_internet_permissions"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="2.06_add_internet_permissions">
                2.06_add_internet_permissions
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/2.07_build_url_with_params/TestUriMatcher.java"
               data-name="2.07_build_url_with_params"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="2.07_build_url_with_params">
                2.07_build_url_with_params
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/2.08_json_parsing/TestUriMatcher.java"
               data-name="2.08_json_parsing"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="2.08_json_parsing">
                2.08_json_parsing
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/2.09_display_data/TestUriMatcher.java"
               data-name="2.09_display_data"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="2.09_display_data">
                2.09_display_data
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/3.00_remove_logging/TestUriMatcher.java"
               data-name="3.00_remove_logging"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="3.00_remove_logging">
                3.00_remove_logging
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/3.01_add_toast/TestUriMatcher.java"
               data-name="3.01_add_toast"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="3.01_add_toast">
                3.01_add_toast
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/3.02_create_detail_activity/TestUriMatcher.java"
               data-name="3.02_create_detail_activity"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="3.02_create_detail_activity">
                3.02_create_detail_activity
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/3.03_launch_detail_activity/TestUriMatcher.java"
               data-name="3.03_launch_detail_activity"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="3.03_launch_detail_activity">
                3.03_launch_detail_activity
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/3.04_populate_detail_text/TestUriMatcher.java"
               data-name="3.04_populate_detail_text"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="3.04_populate_detail_text">
                3.04_populate_detail_text
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/3.05_add_settingsactivity/TestUriMatcher.java"
               data-name="3.05_add_settingsactivity"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="3.05_add_settingsactivity">
                3.05_add_settingsactivity
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/3.06_launch_settings/TestUriMatcher.java"
               data-name="3.06_launch_settings"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="3.06_launch_settings">
                3.06_launch_settings
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/3.07_add_locations_setting/TestUriMatcher.java"
               data-name="3.07_add_locations_setting"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="3.07_add_locations_setting">
                3.07_add_locations_setting
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/3.08_inflate_settingsactivity/TestUriMatcher.java"
               data-name="3.08_inflate_settingsactivity"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="3.08_inflate_settingsactivity">
                3.08_inflate_settingsactivity
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/3.09_location_from_prefs/TestUriMatcher.java"
               data-name="3.09_location_from_prefs"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="3.09_location_from_prefs">
                3.09_location_from_prefs
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/3.10_refactor_fetch_weather/TestUriMatcher.java"
               data-name="3.10_refactor_fetch_weather"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="3.10_refactor_fetch_weather">
                3.10_refactor_fetch_weather
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/3.11_add_units_setting/TestUriMatcher.java"
               data-name="3.11_add_units_setting"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="3.11_add_units_setting">
                3.11_add_units_setting
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/3.12_add_map_intent/TestUriMatcher.java"
               data-name="3.12_add_map_intent"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="3.12_add_map_intent">
                3.12_add_map_intent
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/3.13_add_share_action_provider/TestUriMatcher.java"
               data-name="3.13_add_share_action_provider"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="3.13_add_share_action_provider">
                3.13_add_share_action_provider
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/4.01_life_cycle/TestUriMatcher.java"
               data-name="4.01_life_cycle"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="4.01_life_cycle">
                4.01_life_cycle
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/4.02_start_code_for_lesson_4/TestUriMatcher.java"
               data-name="4.02_start_code_for_lesson_4"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="4.02_start_code_for_lesson_4">
                4.02_start_code_for_lesson_4
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/4.03_define_contract_constants/TestUriMatcher.java"
               data-name="4.03_define_contract_constants"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="4.03_define_contract_constants">
                4.03_define_contract_constants
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/4.04_location_database/TestUriMatcher.java"
               data-name="4.04_location_database"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="4.04_location_database">
                4.04_location_database
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/4.05_test_location_table/TestUriMatcher.java"
               data-name="4.05_test_location_table"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="4.05_test_location_table">
                4.05_test_location_table
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/4.06_test_weather_table/TestUriMatcher.java"
               data-name="4.06_test_weather_table"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="4.06_test_weather_table">
                4.06_test_weather_table
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/4.07_start_code_content_provider/TestUriMatcher.java"
               data-name="4.07_start_code_content_provider"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="4.07_start_code_content_provider">
                4.07_start_code_content_provider
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/4.08_uribuilder_weather_with_location/TestUriMatcher.java"
               data-name="4.08_uribuilder_weather_with_location"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="4.08_uribuilder_weather_with_location">
                4.08_uribuilder_weather_with_location
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/4.09_write_uri_matcher/TestUriMatcher.java"
               data-name="4.09_write_uri_matcher"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="4.09_write_uri_matcher">
                4.09_write_uri_matcher
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/4.10_register_contentprovider/TestUriMatcher.java"
               data-name="4.10_register_contentprovider"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="4.10_register_contentprovider">
                4.10_register_contentprovider
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/4.11_gettype/TestUriMatcher.java"
               data-name="4.11_gettype"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="4.11_gettype">
                4.11_gettype
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/4.12_query/TestUriMatcher.java"
               data-name="4.12_query"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="4.12_query">
                4.12_query
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/4.13_insert/TestUriMatcher.java"
               data-name="4.13_insert"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="4.13_insert">
                4.13_insert
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/4.14_update_delete/TestUriMatcher.java"
               data-name="4.14_update_delete"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="4.14_update_delete">
                4.14_update_delete
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/4.15_refactor_fetchweather/TestUriMatcher.java"
               data-name="4.15_refactor_fetchweather"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="4.15_refactor_fetchweather">
                4.15_refactor_fetchweather
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/4.16_use_contentprovider_inserts/TestUriMatcher.java"
               data-name="4.16_use_contentprovider_inserts"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="4.16_use_contentprovider_inserts">
                4.16_use_contentprovider_inserts
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/4.17_bulkinserts_with_contentprovider/TestUriMatcher.java"
               data-name="4.17_bulkinserts_with_contentprovider"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="4.17_bulkinserts_with_contentprovider">
                4.17_bulkinserts_with_contentprovider
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/4.18_cursor_adapter/TestUriMatcher.java"
               data-name="4.18_cursor_adapter"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="4.18_cursor_adapter">
                4.18_cursor_adapter
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/4.19_loaders/TestUriMatcher.java"
               data-name="4.19_loaders"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="4.19_loaders">
                4.19_loaders
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/4.20_projections/TestUriMatcher.java"
               data-name="4.20_projections"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="4.20_projections">
                4.20_projections
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/4.21_details_view/TestUriMatcher.java"
               data-name="4.21_details_view"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="4.21_details_view">
                4.21_details_view
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/4.22_fix_details_view/TestUriMatcher.java"
               data-name="4.22_fix_details_view"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="4.22_fix_details_view">
                4.22_fix_details_view
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/4.23_fix_settings/TestUriMatcher.java"
               data-name="4.23_fix_settings"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="4.23_fix_settings">
                4.23_fix_settings
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/5.01_build_list_item/TestUriMatcher.java"
               data-name="5.01_build_list_item"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="5.01_build_list_item">
                5.01_build_list_item
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/5.02_build_today_item/TestUriMatcher.java"
               data-name="5.02_build_today_item"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="5.02_build_today_item">
                5.02_build_today_item
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/5.03_update_forecast_adapter/TestUriMatcher.java"
               data-name="5.03_update_forecast_adapter"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="5.03_update_forecast_adapter">
                5.03_update_forecast_adapter
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/5.04_two_item_view_types/TestUriMatcher.java"
               data-name="5.04_two_item_view_types"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="5.04_two_item_view_types">
                5.04_two_item_view_types
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/5.05_viewholder/TestUriMatcher.java"
               data-name="5.05_viewholder"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="5.05_viewholder">
                5.05_viewholder
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/5.06_formatting_strings/TestUriMatcher.java"
               data-name="5.06_formatting_strings"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="5.06_formatting_strings">
                5.06_formatting_strings
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/5.07_details_screen/TestUriMatcher.java"
               data-name="5.07_details_screen"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="5.07_details_screen">
                5.07_details_screen
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/5.08_images/TestUriMatcher.java"
               data-name="5.08_images"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="5.08_images">
                5.08_images
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/5.09_two_pane_ui/TestUriMatcher.java"
               data-name="5.09_two_pane_ui"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="5.09_two_pane_ui">
                5.09_two_pane_ui
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/5.10_selected_item/TestUriMatcher.java"
               data-name="5.10_selected_item"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="5.10_selected_item">
                5.10_selected_item
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/5.11_activated_item/TestUriMatcher.java"
               data-name="5.11_activated_item"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="5.11_activated_item">
                5.11_activated_item
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/5.12_scroll_position/TestUriMatcher.java"
               data-name="5.12_scroll_position"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="5.12_scroll_position">
                5.12_scroll_position
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/5.13_alternative_detail_layout/TestUriMatcher.java"
               data-name="5.13_alternative_detail_layout"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="5.13_alternative_detail_layout">
                5.13_alternative_detail_layout
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/5.14_today_item_tablet/TestUriMatcher.java"
               data-name="5.14_today_item_tablet"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="5.14_today_item_tablet">
                5.14_today_item_tablet
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/5.15_action_bar/TestUriMatcher.java"
               data-name="5.15_action_bar"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="5.15_action_bar">
                5.15_action_bar
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/5.16_settings_action_bar/TestUriMatcher.java"
               data-name="5.16_settings_action_bar"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="5.16_settings_action_bar">
                5.16_settings_action_bar
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/5.17_redlines_list_item/TestUriMatcher.java"
               data-name="5.17_redlines_list_item"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="5.17_redlines_list_item">
                5.17_redlines_list_item
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/5.18_redlines_finish/TestUriMatcher.java"
               data-name="5.18_redlines_finish"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="5.18_redlines_finish">
                5.18_redlines_finish
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/5.19_accessibility/TestUriMatcher.java"
               data-name="5.19_accessibility"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="5.19_accessibility">
                5.19_accessibility
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/6.01_services/TestUriMatcher.java"
               data-name="6.01_services"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="6.01_services">
                6.01_services
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/6.02_alarms/TestUriMatcher.java"
               data-name="6.02_alarms"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="6.02_alarms">
                6.02_alarms
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/6.03_implement_sync_adapter/TestUriMatcher.java"
               data-name="6.03_implement_sync_adapter"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="6.03_implement_sync_adapter">
                6.03_implement_sync_adapter
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/6.04_finish_sync_adapter/TestUriMatcher.java"
               data-name="6.04_finish_sync_adapter"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="6.04_finish_sync_adapter">
                6.04_finish_sync_adapter
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/6.05_scheduled_sync/TestUriMatcher.java"
               data-name="6.05_scheduled_sync"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="6.05_scheduled_sync">
                6.05_scheduled_sync
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/6.06_notifications_quiz/TestUriMatcher.java"
               data-name="6.06_notifications_quiz"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="6.06_notifications_quiz">
                6.06_notifications_quiz
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/6.07_notifications_answer/TestUriMatcher.java"
               data-name="6.07_notifications_answer"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="6.07_notifications_answer">
                6.07_notifications_answer
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/6.08_turn_off_notifications/TestUriMatcher.java"
               data-name="6.08_turn_off_notifications"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="6.08_turn_off_notifications">
                6.08_turn_off_notifications
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/6.09_delete_old_data/TestUriMatcher.java"
               data-name="6.09_delete_old_data"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="6.09_delete_old_data">
                6.09_delete_old_data
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/6.10_update_map_intent/TestUriMatcher.java"
               data-name="6.10_update_map_intent"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="6.10_update_map_intent">
                6.10_update_map_intent
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/initial_commit/TestUriMatcher.java"
               data-name="initial_commit"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="initial_commit">
                initial_commit
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open selected"
               href="/udacity/Sunshine-Version-2/blob/lesson_4_content_provider_starter_code/TestUriMatcher.java"
               data-name="lesson_4_content_provider_starter_code"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="lesson_4_content_provider_starter_code">
                lesson_4_content_provider_starter_code
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/lesson_4_starter_code/TestUriMatcher.java"
               data-name="lesson_4_starter_code"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="lesson_4_starter_code">
                lesson_4_starter_code
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/lesson_6_sync_adapter_starter_code/TestUriMatcher.java"
               data-name="lesson_6_sync_adapter_starter_code"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="lesson_6_sync_adapter_starter_code">
                lesson_6_sync_adapter_starter_code
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/sunshine_master/TestUriMatcher.java"
               data-name="sunshine_master"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="sunshine_master">
                sunshine_master
              </span>
            </a>
        </div>

          <div class="select-menu-no-results">Nothing to show</div>
      </div>

      <div class="select-menu-list select-menu-tab-bucket js-select-menu-tab-bucket" data-tab-filter="tags">
        <div data-filterable-for="context-commitish-filter-field" data-filterable-type="substring">


        </div>

        <div class="select-menu-no-results">Nothing to show</div>
      </div>

    </div>
  </div>
</div>

  <div class="btn-group right">
    <a href="/udacity/Sunshine-Version-2/find/lesson_4_content_provider_starter_code"
          class="js-show-file-finder btn btn-sm"
          data-pjax
          data-hotkey="t">
      Find file
    </a>
    <button aria-label="Copy file path to clipboard" class="js-zeroclipboard btn btn-sm zeroclipboard-button tooltipped tooltipped-s" data-copied-hint="Copied!" type="button">Copy path</button>
  </div>
  <div class="breadcrumb js-zeroclipboard-target">
    <span class="repo-root js-repo-root"><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/udacity/Sunshine-Version-2/tree/lesson_4_content_provider_starter_code" class="" data-branch="lesson_4_content_provider_starter_code" data-pjax="true" itemscope="url"><span itemprop="title">Sunshine-Version-2</span></a></span></span><span class="separator">/</span><strong class="final-path">TestUriMatcher.java</strong>
  </div>
</div>


  <div class="commit-tease">
      <span class="right">
        <a class="commit-tease-sha" href="/udacity/Sunshine-Version-2/commit/1578a360189e9e929004894ed3e8f2210b7db8a7" data-pjax>
          1578a36
        </a>
        <time datetime="2015-03-04T23:54:47Z" is="relative-time">Mar 4, 2015</time>
      </span>
      <div>
        <img alt="@ceruleanotter" class="avatar" height="20" src="https://avatars2.githubusercontent.com/u/3414789?v=3&amp;s=40" width="20" />
        <a href="/ceruleanotter" class="user-mention" rel="contributor">ceruleanotter</a>
          <a href="/udacity/Sunshine-Version-2/commit/1578a360189e9e929004894ed3e8f2210b7db8a7" class="message" data-pjax="true" title="Starter code for 4B, the Content Provider Lesson">Starter code for 4B, the Content Provider Lesson</a>
      </div>

    <div class="commit-tease-contributors">
      <a class="muted-link contributors-toggle" href="#blob_contributors_box" rel="facebox">
        <strong>1</strong>
         contributor
      </a>
      
    </div>

    <div id="blob_contributors_box" style="display:none">
      <h2 class="facebox-header" data-facebox-id="facebox-header">Users who have contributed to this file</h2>
      <ul class="facebox-user-list" data-facebox-id="facebox-description">
          <li class="facebox-user-list-item">
            <img alt="@ceruleanotter" height="24" src="https://avatars0.githubusercontent.com/u/3414789?v=3&amp;s=48" width="24" />
            <a href="/ceruleanotter">ceruleanotter</a>
          </li>
      </ul>
    </div>
  </div>

<div class="file">
  <div class="file-header">
  <div class="file-actions">

    <div class="btn-group">
      <a href="/udacity/Sunshine-Version-2/raw/lesson_4_content_provider_starter_code/TestUriMatcher.java" class="btn btn-sm " id="raw-url">Raw</a>
        <a href="/udacity/Sunshine-Version-2/blame/lesson_4_content_provider_starter_code/TestUriMatcher.java" class="btn btn-sm js-update-url-with-hash">Blame</a>
      <a href="/udacity/Sunshine-Version-2/commits/lesson_4_content_provider_starter_code/TestUriMatcher.java" class="btn btn-sm " rel="nofollow">History</a>
    </div>

        <a class="octicon-btn tooltipped tooltipped-nw"
           href="github-windows://openRepo/https://github.com/udacity/Sunshine-Version-2?branch=lesson_4_content_provider_starter_code&amp;filepath=TestUriMatcher.java"
           aria-label="Open this file in GitHub Desktop"
           data-ga-click="Repository, open with desktop, type:windows">
            <span class="octicon octicon-device-desktop"></span>
        </a>

        <!-- </textarea> --><!-- '"` --><form accept-charset="UTF-8" action="/udacity/Sunshine-Version-2/edit/lesson_4_content_provider_starter_code/TestUriMatcher.java" class="inline-form js-update-url-with-hash" data-form-nonce="f932e609a7aba515788282d5f65b552073ae4757" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="SBt459PXdzOaxPIVt2cVzluK2rSLqmdFsYnFkFn4vz2yO5IivlI1XUGCvq81EaHip64i/Av6r5nU6hCmwcck2g==" /></div>
          <button class="octicon-btn tooltipped tooltipped-nw" type="submit"
            aria-label="Edit the file in your fork of this project" data-hotkey="e" data-disable-with>
            <span class="octicon octicon-pencil"></span>
          </button>
</form>        <!-- </textarea> --><!-- '"` --><form accept-charset="UTF-8" action="/udacity/Sunshine-Version-2/delete/lesson_4_content_provider_starter_code/TestUriMatcher.java" class="inline-form" data-form-nonce="f932e609a7aba515788282d5f65b552073ae4757" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="h0dnqi8nWFo3j2f+22Of4GIhtUK12dFHYD12q/XuOKsl9IQ2dCZt5HiIhlcTruhf5ARc7lutTQmwyZRS9dRs/A==" /></div>
          <button class="octicon-btn octicon-btn-danger tooltipped tooltipped-nw" type="submit"
            aria-label="Delete the file in your fork of this project" data-disable-with>
            <span class="octicon octicon-trashcan"></span>
          </button>
</form>  </div>

  <div class="file-info">
      57 lines (52 sloc)
      <span class="file-info-divider"></span>
    2.96 KB
  </div>
</div>

  

  <div class="blob-wrapper data type-java">
      <table class="highlight tab-size js-file-line-container" data-tab-size="8">
      <tr>
        <td id="L1" class="blob-num js-line-number" data-line-number="1"></td>
        <td id="LC1" class="blob-code blob-code-inner js-file-line"><span class="pl-c">/*</span></td>
      </tr>
      <tr>
        <td id="L2" class="blob-num js-line-number" data-line-number="2"></td>
        <td id="LC2" class="blob-code blob-code-inner js-file-line"><span class="pl-c"> * Copyright (C) 2014 The Android Open Source Project</span></td>
      </tr>
      <tr>
        <td id="L3" class="blob-num js-line-number" data-line-number="3"></td>
        <td id="LC3" class="blob-code blob-code-inner js-file-line"><span class="pl-c"> *</span></td>
      </tr>
      <tr>
        <td id="L4" class="blob-num js-line-number" data-line-number="4"></td>
        <td id="LC4" class="blob-code blob-code-inner js-file-line"><span class="pl-c"> * Licensed under the Apache License, Version 2.0 (the &quot;License&quot;);</span></td>
      </tr>
      <tr>
        <td id="L5" class="blob-num js-line-number" data-line-number="5"></td>
        <td id="LC5" class="blob-code blob-code-inner js-file-line"><span class="pl-c"> * you may not use this file except in compliance with the License.</span></td>
      </tr>
      <tr>
        <td id="L6" class="blob-num js-line-number" data-line-number="6"></td>
        <td id="LC6" class="blob-code blob-code-inner js-file-line"><span class="pl-c"> * You may obtain a copy of the License at</span></td>
      </tr>
      <tr>
        <td id="L7" class="blob-num js-line-number" data-line-number="7"></td>
        <td id="LC7" class="blob-code blob-code-inner js-file-line"><span class="pl-c"> *</span></td>
      </tr>
      <tr>
        <td id="L8" class="blob-num js-line-number" data-line-number="8"></td>
        <td id="LC8" class="blob-code blob-code-inner js-file-line"><span class="pl-c"> *      http://www.apache.org/licenses/LICENSE-2.0</span></td>
      </tr>
      <tr>
        <td id="L9" class="blob-num js-line-number" data-line-number="9"></td>
        <td id="LC9" class="blob-code blob-code-inner js-file-line"><span class="pl-c"> *</span></td>
      </tr>
      <tr>
        <td id="L10" class="blob-num js-line-number" data-line-number="10"></td>
        <td id="LC10" class="blob-code blob-code-inner js-file-line"><span class="pl-c"> * Unless required by applicable law or agreed to in writing, software</span></td>
      </tr>
      <tr>
        <td id="L11" class="blob-num js-line-number" data-line-number="11"></td>
        <td id="LC11" class="blob-code blob-code-inner js-file-line"><span class="pl-c"> * distributed under the License is distributed on an &quot;AS IS&quot; BASIS,</span></td>
      </tr>
      <tr>
        <td id="L12" class="blob-num js-line-number" data-line-number="12"></td>
        <td id="LC12" class="blob-code blob-code-inner js-file-line"><span class="pl-c"> * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.</span></td>
      </tr>
      <tr>
        <td id="L13" class="blob-num js-line-number" data-line-number="13"></td>
        <td id="LC13" class="blob-code blob-code-inner js-file-line"><span class="pl-c"> * See the License for the specific language governing permissions and</span></td>
      </tr>
      <tr>
        <td id="L14" class="blob-num js-line-number" data-line-number="14"></td>
        <td id="LC14" class="blob-code blob-code-inner js-file-line"><span class="pl-c"> * limitations under the License.</span></td>
      </tr>
      <tr>
        <td id="L15" class="blob-num js-line-number" data-line-number="15"></td>
        <td id="LC15" class="blob-code blob-code-inner js-file-line"><span class="pl-c"> */</span></td>
      </tr>
      <tr>
        <td id="L16" class="blob-num js-line-number" data-line-number="16"></td>
        <td id="LC16" class="blob-code blob-code-inner js-file-line"><span class="pl-k">package</span> <span class="pl-smi">com.example.android.sunshine.app.data</span>;</td>
      </tr>
      <tr>
        <td id="L17" class="blob-num js-line-number" data-line-number="17"></td>
        <td id="LC17" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L18" class="blob-num js-line-number" data-line-number="18"></td>
        <td id="LC18" class="blob-code blob-code-inner js-file-line"><span class="pl-k">import</span> <span class="pl-smi">android.net.Uri</span>;</td>
      </tr>
      <tr>
        <td id="L19" class="blob-num js-line-number" data-line-number="19"></td>
        <td id="LC19" class="blob-code blob-code-inner js-file-line"><span class="pl-k">import</span> <span class="pl-smi">android.test.AndroidTestCase</span>;</td>
      </tr>
      <tr>
        <td id="L20" class="blob-num js-line-number" data-line-number="20"></td>
        <td id="LC20" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L21" class="blob-num js-line-number" data-line-number="21"></td>
        <td id="LC21" class="blob-code blob-code-inner js-file-line"><span class="pl-c">/*</span></td>
      </tr>
      <tr>
        <td id="L22" class="blob-num js-line-number" data-line-number="22"></td>
        <td id="LC22" class="blob-code blob-code-inner js-file-line"><span class="pl-c">    Uncomment this class when you are ready to test your UriMatcher.  Note that this class utilizes</span></td>
      </tr>
      <tr>
        <td id="L23" class="blob-num js-line-number" data-line-number="23"></td>
        <td id="LC23" class="blob-code blob-code-inner js-file-line"><span class="pl-c">    constants that are declared with package protection inside of the UriMatcher, which is why</span></td>
      </tr>
      <tr>
        <td id="L24" class="blob-num js-line-number" data-line-number="24"></td>
        <td id="LC24" class="blob-code blob-code-inner js-file-line"><span class="pl-c">    the test must be in the same data package as the Android app code.  Doing the test this way is</span></td>
      </tr>
      <tr>
        <td id="L25" class="blob-num js-line-number" data-line-number="25"></td>
        <td id="LC25" class="blob-code blob-code-inner js-file-line"><span class="pl-c">    a nice compromise between data hiding and testability.</span></td>
      </tr>
      <tr>
        <td id="L26" class="blob-num js-line-number" data-line-number="26"></td>
        <td id="LC26" class="blob-code blob-code-inner js-file-line"><span class="pl-c"> */</span></td>
      </tr>
      <tr>
        <td id="L27" class="blob-num js-line-number" data-line-number="27"></td>
        <td id="LC27" class="blob-code blob-code-inner js-file-line"><span class="pl-k">public</span> <span class="pl-k">class</span> <span class="pl-en">TestUriMatcher</span> <span class="pl-k">extends</span> <span class="pl-e">AndroidTestCase</span> {</td>
      </tr>
      <tr>
        <td id="L28" class="blob-num js-line-number" data-line-number="28"></td>
        <td id="LC28" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-k">static</span> <span class="pl-k">final</span> <span class="pl-smi">String</span> <span class="pl-c1">LOCATION_QUERY</span> <span class="pl-k">=</span> <span class="pl-s"><span class="pl-pds">&quot;</span>London, UK<span class="pl-pds">&quot;</span></span>;</td>
      </tr>
      <tr>
        <td id="L29" class="blob-num js-line-number" data-line-number="29"></td>
        <td id="LC29" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-k">static</span> <span class="pl-k">final</span> <span class="pl-k">long</span> <span class="pl-c1">TEST_DATE</span> <span class="pl-k">=</span> <span class="pl-c1">1419033600L</span>;  <span class="pl-c">// December 20th, 2014</span></td>
      </tr>
      <tr>
        <td id="L30" class="blob-num js-line-number" data-line-number="30"></td>
        <td id="LC30" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-k">static</span> <span class="pl-k">final</span> <span class="pl-k">long</span> <span class="pl-c1">TEST_LOCATION_ID</span> <span class="pl-k">=</span> <span class="pl-c1">10L</span>;</td>
      </tr>
      <tr>
        <td id="L31" class="blob-num js-line-number" data-line-number="31"></td>
        <td id="LC31" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L32" class="blob-num js-line-number" data-line-number="32"></td>
        <td id="LC32" class="blob-code blob-code-inner js-file-line">    <span class="pl-c">// content://com.example.android.sunshine.app/weather&quot;</span></td>
      </tr>
      <tr>
        <td id="L33" class="blob-num js-line-number" data-line-number="33"></td>
        <td id="LC33" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-k">static</span> <span class="pl-k">final</span> <span class="pl-smi">Uri</span> <span class="pl-c1">TEST_WEATHER_DIR</span> <span class="pl-k">=</span> <span class="pl-smi">WeatherContract</span><span class="pl-k">.</span><span class="pl-smi">WeatherEntry</span><span class="pl-c1"><span class="pl-k">.</span>CONTENT_URI</span>;</td>
      </tr>
      <tr>
        <td id="L34" class="blob-num js-line-number" data-line-number="34"></td>
        <td id="LC34" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-k">static</span> <span class="pl-k">final</span> <span class="pl-smi">Uri</span> <span class="pl-c1">TEST_WEATHER_WITH_LOCATION_DIR</span> <span class="pl-k">=</span> <span class="pl-smi">WeatherContract</span><span class="pl-k">.</span><span class="pl-smi">WeatherEntry</span><span class="pl-k">.</span>buildWeatherLocation(<span class="pl-c1">LOCATION_QUERY</span>);</td>
      </tr>
      <tr>
        <td id="L35" class="blob-num js-line-number" data-line-number="35"></td>
        <td id="LC35" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-k">static</span> <span class="pl-k">final</span> <span class="pl-smi">Uri</span> <span class="pl-c1">TEST_WEATHER_WITH_LOCATION_AND_DATE_DIR</span> <span class="pl-k">=</span> <span class="pl-smi">WeatherContract</span><span class="pl-k">.</span><span class="pl-smi">WeatherEntry</span><span class="pl-k">.</span>buildWeatherLocationWithDate(<span class="pl-c1">LOCATION_QUERY</span>, <span class="pl-c1">TEST_DATE</span>);</td>
      </tr>
      <tr>
        <td id="L36" class="blob-num js-line-number" data-line-number="36"></td>
        <td id="LC36" class="blob-code blob-code-inner js-file-line">    <span class="pl-c">// content://com.example.android.sunshine.app/location&quot;</span></td>
      </tr>
      <tr>
        <td id="L37" class="blob-num js-line-number" data-line-number="37"></td>
        <td id="LC37" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-k">static</span> <span class="pl-k">final</span> <span class="pl-smi">Uri</span> <span class="pl-c1">TEST_LOCATION_DIR</span> <span class="pl-k">=</span> <span class="pl-smi">WeatherContract</span><span class="pl-k">.</span><span class="pl-smi">LocationEntry</span><span class="pl-c1"><span class="pl-k">.</span>CONTENT_URI</span>;</td>
      </tr>
      <tr>
        <td id="L38" class="blob-num js-line-number" data-line-number="38"></td>
        <td id="LC38" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L39" class="blob-num js-line-number" data-line-number="39"></td>
        <td id="LC39" class="blob-code blob-code-inner js-file-line">    <span class="pl-c">/*</span></td>
      </tr>
      <tr>
        <td id="L40" class="blob-num js-line-number" data-line-number="40"></td>
        <td id="LC40" class="blob-code blob-code-inner js-file-line"><span class="pl-c">        Students: This function tests that your UriMatcher returns the correct integer value</span></td>
      </tr>
      <tr>
        <td id="L41" class="blob-num js-line-number" data-line-number="41"></td>
        <td id="LC41" class="blob-code blob-code-inner js-file-line"><span class="pl-c">        for each of the Uri types that our ContentProvider can handle.  Uncomment this when you are</span></td>
      </tr>
      <tr>
        <td id="L42" class="blob-num js-line-number" data-line-number="42"></td>
        <td id="LC42" class="blob-code blob-code-inner js-file-line"><span class="pl-c">        ready to test your UriMatcher.</span></td>
      </tr>
      <tr>
        <td id="L43" class="blob-num js-line-number" data-line-number="43"></td>
        <td id="LC43" class="blob-code blob-code-inner js-file-line"><span class="pl-c">     */</span></td>
      </tr>
      <tr>
        <td id="L44" class="blob-num js-line-number" data-line-number="44"></td>
        <td id="LC44" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//    public void testUriMatcher() {</span></td>
      </tr>
      <tr>
        <td id="L45" class="blob-num js-line-number" data-line-number="45"></td>
        <td id="LC45" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//        UriMatcher testMatcher = WeatherProvider.buildUriMatcher();</span></td>
      </tr>
      <tr>
        <td id="L46" class="blob-num js-line-number" data-line-number="46"></td>
        <td id="LC46" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//</span></td>
      </tr>
      <tr>
        <td id="L47" class="blob-num js-line-number" data-line-number="47"></td>
        <td id="LC47" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//        assertEquals(&quot;Error: The WEATHER URI was matched incorrectly.&quot;,</span></td>
      </tr>
      <tr>
        <td id="L48" class="blob-num js-line-number" data-line-number="48"></td>
        <td id="LC48" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//                testMatcher.match(TEST_WEATHER_DIR), WeatherProvider.WEATHER);</span></td>
      </tr>
      <tr>
        <td id="L49" class="blob-num js-line-number" data-line-number="49"></td>
        <td id="LC49" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//        assertEquals(&quot;Error: The WEATHER WITH LOCATION URI was matched incorrectly.&quot;,</span></td>
      </tr>
      <tr>
        <td id="L50" class="blob-num js-line-number" data-line-number="50"></td>
        <td id="LC50" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//                testMatcher.match(TEST_WEATHER_WITH_LOCATION_DIR), WeatherProvider.WEATHER_WITH_LOCATION);</span></td>
      </tr>
      <tr>
        <td id="L51" class="blob-num js-line-number" data-line-number="51"></td>
        <td id="LC51" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//        assertEquals(&quot;Error: The WEATHER WITH LOCATION AND DATE URI was matched incorrectly.&quot;,</span></td>
      </tr>
      <tr>
        <td id="L52" class="blob-num js-line-number" data-line-number="52"></td>
        <td id="LC52" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//                testMatcher.match(TEST_WEATHER_WITH_LOCATION_AND_DATE_DIR), WeatherProvider.WEATHER_WITH_LOCATION_AND_DATE);</span></td>
      </tr>
      <tr>
        <td id="L53" class="blob-num js-line-number" data-line-number="53"></td>
        <td id="LC53" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//        assertEquals(&quot;Error: The LOCATION URI was matched incorrectly.&quot;,</span></td>
      </tr>
      <tr>
        <td id="L54" class="blob-num js-line-number" data-line-number="54"></td>
        <td id="LC54" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//                testMatcher.match(TEST_LOCATION_DIR), WeatherProvider.LOCATION);</span></td>
      </tr>
      <tr>
        <td id="L55" class="blob-num js-line-number" data-line-number="55"></td>
        <td id="LC55" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//    }</span></td>
      </tr>
      <tr>
        <td id="L56" class="blob-num js-line-number" data-line-number="56"></td>
        <td id="LC56" class="blob-code blob-code-inner js-file-line">}</td>
      </tr>
</table>

  </div>

</div>

<a href="#jump-to-line" rel="facebox[.linejump]" data-hotkey="l" style="display:none">Jump to Line</a>
<div id="jump-to-line" style="display:none">
  <!-- </textarea> --><!-- '"` --><form accept-charset="UTF-8" action="" class="js-jump-to-line-form" method="get"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /></div>
    <input class="linejump-input js-jump-to-line-field" type="text" placeholder="Jump to line&hellip;" aria-label="Jump to line" autofocus>
    <button type="submit" class="btn">Go</button>
</form></div>

  </div>
  <div class="modal-backdrop"></div>
</div>

    </div>
  </div>

    </div>

      <div class="container">
  <div class="site-footer" role="contentinfo">
    <ul class="site-footer-links right">
        <li><a href="https://status.github.com/" data-ga-click="Footer, go to status, text:status">Status</a></li>
      <li><a href="https://developer.github.com" data-ga-click="Footer, go to api, text:api">API</a></li>
      <li><a href="https://training.github.com" data-ga-click="Footer, go to training, text:training">Training</a></li>
      <li><a href="https://shop.github.com" data-ga-click="Footer, go to shop, text:shop">Shop</a></li>
        <li><a href="https://github.com/blog" data-ga-click="Footer, go to blog, text:blog">Blog</a></li>
        <li><a href="https://github.com/about" data-ga-click="Footer, go to about, text:about">About</a></li>
        <li><a href="https://github.com/pricing" data-ga-click="Footer, go to pricing, text:pricing">Pricing</a></li>

    </ul>

    <a href="https://github.com" aria-label="Homepage">
      <span class="mega-octicon octicon-mark-github" title="GitHub"></span>
</a>
    <ul class="site-footer-links">
      <li>&copy; 2015 <span title="0.06387s from github-fe144-cp1-prd.iad.github.net">GitHub</span>, Inc.</li>
        <li><a href="https://github.com/site/terms" data-ga-click="Footer, go to terms, text:terms">Terms</a></li>
        <li><a href="https://github.com/site/privacy" data-ga-click="Footer, go to privacy, text:privacy">Privacy</a></li>
        <li><a href="https://github.com/security" data-ga-click="Footer, go to security, text:security">Security</a></li>
        <li><a href="https://github.com/contact" data-ga-click="Footer, go to contact, text:contact">Contact</a></li>
        <li><a href="https://help.github.com" data-ga-click="Footer, go to help, text:help">Help</a></li>
    </ul>
  </div>
</div>



    
    
    

    <div id="ajax-error-message" class="flash flash-error">
      <span class="octicon octicon-alert"></span>
      <button type="button" class="flash-close js-flash-close js-ajax-error-dismiss" aria-label="Dismiss error">
        <span class="octicon octicon-x"></span>
      </button>
      Something went wrong with that request. Please try again.
    </div>


      <script crossorigin="anonymous" src="https://assets-cdn.github.com/assets/frameworks-b7c9523d93e6cd0235a0a8b7d1a691f7909d3834cd9c9caa7b1674ba508b644c.js"></script>
      <script async="async" crossorigin="anonymous" src="https://assets-cdn.github.com/assets/github-9007abd65dc2376172caebfa899c791deac853b23cbbacac616acda4d12fcf96.js"></script>
      
      
      
    <div class="js-stale-session-flash stale-session-flash flash flash-warn flash-banner hidden">
      <span class="octicon octicon-alert"></span>
      <span class="signed-in-tab-flash">You signed in with another tab or window. <a href="">Reload</a> to refresh your session.</span>
      <span class="signed-out-tab-flash">You signed out in another tab or window. <a href="">Reload</a> to refresh your session.</span>
    </div>
  </body>
</html>

